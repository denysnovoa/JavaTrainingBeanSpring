package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWordBean {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");

    HelloWorld obj = (HelloWorld) context.getBean("helloBean");

    obj.printName();
  }
}
