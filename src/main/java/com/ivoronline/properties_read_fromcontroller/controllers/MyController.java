package com.ivoronline.properties_read_fromcontroller.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @Value("${messages.hello1}")
  private String message;

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    return message;
  }

}
