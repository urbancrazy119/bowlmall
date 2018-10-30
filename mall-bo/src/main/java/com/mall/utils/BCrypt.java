package com.mall.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCrypt {

  public static void main(String[] args) {
    String rawPassword = "csai2306";
    String encodedPassword = "";

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    encodedPassword = encoder.encode(rawPassword);

    System.out.println(encodedPassword);
    System.out.println(encodedPassword.length());
  }

}
