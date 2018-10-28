package com.csai.mall.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 31869365773996481L;

  // @Id
  // @GeneratedValue
  // private long id;

  @Id
  @Column(name = "userid")
  private String userid;

  @Column(name = "name", nullable = false)
  private String name;

  // @CreationTimestamp
  // private Date regDate;
  //
  // @UpdateTimestamp
  // private Date updateDate;

  // protected User() {
  // // TODO Auto-generated constructor stub
  // }

  // public User(String userid, String name) {
  // this.userid = userid;
  // this.name = name;
  // }

}
