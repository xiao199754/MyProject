package com.gupaoedu.config;

import com.gupaoedu.Job.MyJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/31 9:52
 */
@Configuration
public class QuartzConfig {

    /**
     * 创建Job对象
     * @return
     */
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean(){
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        // 关联 Job类
        factoryBean.setJobClass(MyJob.class);
        return factoryBean;
    }

    /**
     * 创建Trigger对象
     * @return
     */
    @Bean
    public SimpleTriggerFactoryBean simpleTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        // 关联JobDetail对象
        factoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        // 设置间隔时间
        factoryBean.setRepeatInterval(2000);
        // 设置重复次数
        factoryBean.setRepeatCount(3);
        return factoryBean;
    }
    /**
     * 创建Trigger对象 Cron表达式
     * @return
     */
    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean factoryBean = new CronTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        // 设置触发的时间
        factoryBean.setCronExpression("0/3 * * * * ?");
        return factoryBean;
    }

    /**
     * 创建对应的Scheduler对象
     * @param cronTriggerFactoryBean
     * @return
     */
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean){
        SchedulerFactoryBean factoryBean = new SchedulerFactoryBean();
        factoryBean.setTriggers(cronTriggerFactoryBean.getObject());
        return factoryBean;
    }
}
