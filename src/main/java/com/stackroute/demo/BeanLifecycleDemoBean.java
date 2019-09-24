package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container Destroyed!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init Method After properties are set!");
    }
    public void customInit(){
        System.out.println("Custom Init function");

    }
    public void customDestroy(){
        System.out.println("Custom Destroy Function");
    }
}
