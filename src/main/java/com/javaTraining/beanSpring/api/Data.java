package com.javaTraining.beanSpring.api;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Data {

  List<Greeting> greetings = Arrays.asList(new Greeting(1, "context1"), new Greeting(2, "context2"));

  public List<Greeting> list() {
    return greetings;
  }

  public void add(Greeting greeting) {
    greetings.add(greeting);
  }

  public Greeting get(int index) {
    return greetings.get(index);
  }

  public void remove(int index) {
    greetings.remove(index);
  }

  public Greeting update(int index, Greeting greeting) {
    greetings.set(index, greeting);

    return greetings.get(index);
  }
}
