package com.klouddy.example.db;

import com.klouddy.example.models.SubjectFilter;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "subject_filter")
public class SubjectFilterEntity implements SubjectFilter {
  @Id
  private String code;
  private String subjectCode;
  private String name;
}
