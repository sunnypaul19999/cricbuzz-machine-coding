package com.ra.oa.machinecoding.cricbuzz.model.post;

import com.ra.oa.machinecoding.cricbuzz.model.premium.PremiumPlan;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  @JoinColumn(name = "post_type_id", nullable = false)
  private PostType postType;

  @OneToOne(mappedBy = "post")
  private PostSummary postSummary;

  @Column(name = "view_count")
  private int viewCount;

  @Column(name = "creation_date", nullable = false)
  private Timestamp creationDate;

  @ManyToOne
  @JoinColumn(name = "premium_plan_id", nullable = false)
  private PremiumPlan premiumPlan;
}
