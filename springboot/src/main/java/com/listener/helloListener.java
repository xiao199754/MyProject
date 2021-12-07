package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class helloListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("-------initListener-----");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("------destroyListener-------");
    }
}
