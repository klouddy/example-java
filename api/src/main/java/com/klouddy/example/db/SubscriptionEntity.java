package com.klouddy.example.db;

import com.klouddy.example.models.Subscription;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity(name = "subscription")
@Data
public class SubscriptionEntity implements Subscription {
  @Id
  private Integer id;
  private String employeeNumber;

  @OneToOne
  @JoinColumn(name = "subject_code", referencedColumnName = "code")
  public SubjectEntity subject;
  @OneToOne
  @JoinColumn(name = "method_id", referencedColumnName = "id")
  public MethodEntity method;

  public Integer getMethodId() {
    return Objects.requireNonNullElse(this.method.getId(), -1);
  }

  public String getSubjectCode() {
    return Objects.requireNonNullElse(this.subject.getCode(), "");
  }
}
