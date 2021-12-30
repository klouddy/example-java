package com.klouddy.example.db;

import com.klouddy.example.models.Method;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity(name = "method")
@Data
public class MethodEntity implements Method {

  @Id
  private Integer id;
  private String employeeNumber;
  private String name;
  private String value;
  private String type;

}
