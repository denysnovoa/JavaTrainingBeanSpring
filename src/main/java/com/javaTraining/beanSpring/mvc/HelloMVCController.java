package com.javaTraining.beanSpring.mvc;

import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloMVCController {

  private final Log logger = LogFactory.getLog(getClass());

  @RequestMapping(value = "hello.htm")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {

    logger.info("Retuning hello view");

    String now = LocalDate.now().toString();

    return new ModelAndView("/WEB-INF/views/hello.jsp", "now", now);
  }

}
