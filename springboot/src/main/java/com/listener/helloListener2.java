package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class helloListener2 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("-------initListener2-----");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("------destroyListener2-------");
    }
}
