package com.klouddy.example.db;

import com.klouddy.example.models.SubscriptionFilter;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity(name = "subscription_filter")
public class SubscriptionFilterEntity implements SubscriptionFilter {

  @Id
  private Integer id;
  private Integer subscriptionId;

  @OneToOne
  @JoinColumn(name = "filter_code", referencedColumnName = "code")
  private SubjectFilterEntity filter;

  public String getFilterCode() {
    return Objects.requireNonNullElse(filter.getCode(), "");
  }

}
