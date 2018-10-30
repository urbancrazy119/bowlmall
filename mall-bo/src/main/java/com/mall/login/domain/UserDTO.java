package com.mall.login.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Length;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@Getter
@Entity
@Table(name = "a_user")
public class UserDTO {

  @Id
  @Column(name = "user_id", unique = true, length = 15)
  private String id;

  @Column(name = "user_name")
  private String name;

  @Column(name = "user_pw")
  @Length(min = 9, max = 15, message = "Invalid password length")
  @ToString.Exclude
  private String password;

  @Column(name = "user_role")
  private String role;

  @Column(name = "user_phone")
  private String phoneNumer;

  @Column(name = "user_addr")
  private String address;

  // @CreationTimestamp
  @Column(name = "reg_dt")
  private Date regDt;

  // @UpdateTimestamp
  @Column(name = "update_dt")
  private Date updateDt;

  @Column(name = "user_status")
  private char state;

}
