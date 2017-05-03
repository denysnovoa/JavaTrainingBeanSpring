package com.javaTraining.beanSpring.core;

public class HelloWorld {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printName() {
    System.out.println("Spring 4 :Hello !" + name);
  }
}
