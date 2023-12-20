package com.ra.oa.machinecoding.cricbuzz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "premium_plans")
public class PremiumPlan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "plan_id")
  private Long planId;

  @Column(name = "plan_name", nullable = false, length = 50)
  private String planName;

  @Column(name = "price", nullable = false, precision = 10, scale = 2)
  private BigDecimal price;

  @Column(name = "validity_days", nullable = false)
  private Integer validityDays;

  @Column(name = "description", columnDefinition = "TEXT")
  private String description;

  @OneToMany(mappedBy = "premiumPlan")
  private List<PlanFeature> planFeatures;

  public Long getPlanId() {
    return planId;
  }

  public void setPlanId(Long planId) {
    this.planId = planId;
  }

  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Integer getValidityDays() {
    return validityDays;
  }

  public void setValidityDays(Integer validityDays) {
    this.validityDays = validityDays;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<PlanFeature> getPlanFeatures() {
    return planFeatures;
  }

  public void setPlanFeatures(List<PlanFeature> planFeatures) {
    this.planFeatures = planFeatures;
  }
}
