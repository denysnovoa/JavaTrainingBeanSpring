package com.javaTrainingBeanSpring.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Autowired
  private Data data;

  @RequestMapping(method = RequestMethod.GET, path = "/greeting")
  public List<Greeting> list() {
    return data.list();
  }

  @RequestMapping(method = RequestMethod.GET, path = "/greeting/{id}")
  public Greeting get(int id) {
    return data.get(id);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/greeting/{id}")
  public void remove(int index) {
    data.remove(index);
  }

  @RequestMapping(method = RequestMethod.PUT, path = "/greeting")
  public void add(@RequestBody Greeting greeting) {
    data.add(greeting);
  }

  @RequestMapping(method = RequestMethod.POST, path = "/greeting/{id}")
  public Greeting update(@PathVariable int id, @RequestBody Greeting greeting) {
    return data.update(id, greeting);
  }

}
