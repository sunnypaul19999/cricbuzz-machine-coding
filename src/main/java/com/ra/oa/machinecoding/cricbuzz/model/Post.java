package com.ra.oa.machinecoding.cricbuzz.model;

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

@Entity
@Table(name = "post")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "post_type_id", nullable = false)
  private PostType postType;

  @OneToOne
  @JoinColumn(name = "post_summary_id", nullable = false)
  private PostSummary postSummary;

  @Column(name = "view_count")
  private int viewCount;

  @Column(name = "creation_date", nullable = false)
  private Timestamp creationDate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PostType getPostType() {
    return postType;
  }

  public void setPostType(PostType postType) {
    this.postType = postType;
  }

  public PostSummary getPostSummary() {
    return postSummary;
  }

  public void setPostSummary(PostSummary postSummary) {
    this.postSummary = postSummary;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }
}
