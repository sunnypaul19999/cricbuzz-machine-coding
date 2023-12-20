package com.ra.oa.machinecoding.cricbuzz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "plan_features")
public class PlanFeature {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "feature_id")
  private Long featureId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "plan_id", nullable = false)
  private PremiumPlan premiumPlan;

  @Column(name = "feature_name", nullable = false, length = 100)
  private String featureName;

  public Long getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Long featureId) {
    this.featureId = featureId;
  }

  public void setPremiumPlan(PremiumPlan premiumPlan) {
    this.premiumPlan = premiumPlan;
  }

  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }
}
