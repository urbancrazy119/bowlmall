package com.csai.mall;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.csai.mall.model.User;
import com.csai.mall.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
  Logger log = LoggerFactory.getLogger(UserController.class);

  @Autowired
  UserRepository userRepository;

  @RequestMapping("/test")
  public void test() {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String encodedPassword = encoder.encode("csai2306");
    log.info(encodedPassword);
    log.info("{}", encodedPassword.length());
  }

  @RequestMapping("")
  public String join() {
    for (User user : userRepository.findAll()) {
      System.out.println(user);
    }

    return "Hello world!";
  }

  // @CrossOrigin(origins = "*")
  @CrossOrigin(origins = {"http://localhost:3000"})
  @GetMapping(path = "/react")
  public List<User> justReactTest(
      @RequestParam(required = false, defaultValue = "NotReact") String value) {
    log.info(value);

    return userRepository.findAll();
  }

}
