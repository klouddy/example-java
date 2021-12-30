package com.klouddy.example.db;

import com.klouddy.example.models.Subject;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity(name = "subject")
public class SubjectEntity implements Subject {
  @Id
  private String code;
  private String name;
  private String description;
  @OneToMany(mappedBy = "subjectCode")
  private List<SubjectFilterEntity> filters;
}
