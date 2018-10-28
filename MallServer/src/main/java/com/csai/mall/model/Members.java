package com.csai.mall.model;

import java.util.Collection;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
public class Members {

  @OneToMany
  private Collection<User> user;

}
