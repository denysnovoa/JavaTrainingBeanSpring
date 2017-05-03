package com.javaTrainingBeanSpring.api;

public class Greeting {

  long id;
  String context;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public Greeting(long id, String context) {
    this.id = id;
    this.context = context;
  }
}
