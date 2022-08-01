package com.gupaoedu.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/31 9:20
 */
@Component
public class MyScheduledTask {

    /**
     * 定时任务的方法
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void doSome(){
        System.out.println("定时任务执行了...." + new Date());
    }
}
