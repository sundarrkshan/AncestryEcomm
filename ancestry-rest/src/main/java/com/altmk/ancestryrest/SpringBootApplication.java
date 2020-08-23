package com.altmk.ancestryrest;


import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;

//Run this as java application start embedded tomcat server and deploy in it automatically

@Configuration
public class SpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplication.class,args);

    }


}
