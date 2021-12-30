package com.klouddy.example.db;

import com.klouddy.example.models.NotifyUser;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity(name = "USER")
@Data
public class NotifyUserEntity implements NotifyUser {
  @Id
  private String employeeNumber;
  private String name;
  @OneToMany(mappedBy = "employeeNumber")
  List<MethodEntity> methods;
}
