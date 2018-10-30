package com.mall.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mall.login.service.LoginService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoginController {

  @Autowired
  LoginService loginService;

  @RequestMapping(value = {"/", "/login"})
  public String login() {
    String result = "";

    log.info("User id: {}, pw: {}");

    return result;
  }

}
