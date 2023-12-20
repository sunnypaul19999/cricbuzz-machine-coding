package com.ra.oa.machinecoding.cricbuzz.model.premium;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "premium_plan")
public class PremiumPlan {

  @Id private int id;

  @Column(name = "plan_name", nullable = false, length = 50)
  private String planName;

  @Column(name = "price", nullable = false, precision = 10, scale = 2)
  private BigDecimal price;

  @Column(name = "validity_days", nullable = false)
  private int validityDays;

  @Column(name = "description", length = 2000)
  private String description;

  @OneToMany(mappedBy = "PremiumPlanFeature")
  private List<PremiumPlanFeature> premiumPlanFeature;
}
