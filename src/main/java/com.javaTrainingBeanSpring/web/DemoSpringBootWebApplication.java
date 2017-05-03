package com.javaTrainingBeanSpring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.javaTrainingBeanSpring"})
public class DemoSpringBootWebApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");

    SpringApplication.run(DemoSpringBootWebApplication.class, args);
  }
}

