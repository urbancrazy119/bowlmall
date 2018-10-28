package com.csai.mall.test;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.csai.mall.model.User;
import com.csai.mall.repository.UserRepository;
import lombok.extern.java.Log;

@RestController
@Log
public class TestController {

  @Autowired
  UserRepository userRepo;

  @CrossOrigin(origins= {"http://localhost:3000"})
  @GetMapping("/react")
  public List<User> justReactTest(
      @RequestParam(name = "value", defaultValue = "NotReact") String value) {

    log.info(value);

    return userRepo.findAll();
  }
}
