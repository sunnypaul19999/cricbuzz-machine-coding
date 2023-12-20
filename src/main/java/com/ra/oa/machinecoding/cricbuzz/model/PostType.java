package com.ra.oa.machinecoding.cricbuzz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post_type")
public class PostType {

  public enum PostTypeEnum {
    VIDEO,
    EDITORIAL
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false, length = 10)
  @Enumerated(EnumType.STRING)
  private PostTypeEnum postType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PostTypeEnum getPostType() {
    return postType;
  }

  public void setPostType(PostTypeEnum postType) {
    this.postType = postType;
  }
}
