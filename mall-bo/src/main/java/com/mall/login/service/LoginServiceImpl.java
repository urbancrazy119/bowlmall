package com.mall.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.login.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  LoginRepository loginRepository;

}
