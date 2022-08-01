package com.gupaoedu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/23 15:08
 */
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FirstListener : 初始化了....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("FirstListener : 销毁了....");
    }
}
