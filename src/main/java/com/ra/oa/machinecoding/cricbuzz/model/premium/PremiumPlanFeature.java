package com.ra.oa.machinecoding.cricbuzz.model.premium;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "premium_plan_feature")
public class PremiumPlanFeature {

  @Id private int id;

  @Getter(AccessLevel.NONE)
  @ManyToOne
  @JoinColumn(name = "premium_plan_id", nullable = false)
  private PremiumPlan PremiumPlanFeature;

  @Column(name = "feature_name", nullable = false, length = 100)
  private String featureName;
}
