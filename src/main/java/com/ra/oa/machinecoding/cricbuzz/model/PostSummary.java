package com.ra.oa.machinecoding.cricbuzz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post_summary")
public class PostSummary {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "author_name", length = 20)
  private String authorName;

  @Column(name = "heading_1", nullable = false, length = 100)
  private String heading1;

  @Column(name = "heading_2", length = 100)
  private String heading2;

  @Column(name = "heading_3", length = 100)
  private String heading3;

  @Column(name = "preview_text", length = 200)
  private String previewText;

  @Column(name = "preview_image_link", nullable = false, columnDefinition = "TEXT")
  private String previewImageLink;

  @Column(name = "post_link", nullable = false, columnDefinition = "TEXT")
  private String postLink;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getHeading1() {
    return heading1;
  }

  public void setHeading1(String heading1) {
    this.heading1 = heading1;
  }

  public String getHeading2() {
    return heading2;
  }

  public void setHeading2(String heading2) {
    this.heading2 = heading2;
  }

  public String getHeading3() {
    return heading3;
  }

  public void setHeading3(String heading3) {
    this.heading3 = heading3;
  }

  public String getPreviewText() {
    return previewText;
  }

  public void setPreviewText(String previewText) {
    this.previewText = previewText;
  }

  public String getPreviewImageLink() {
    return previewImageLink;
  }

  public void setPreviewImageLink(String previewImageLink) {
    this.previewImageLink = previewImageLink;
  }

  public String getPostLink() {
    return postLink;
  }

  public void setPostLink(String postLink) {
    this.postLink = postLink;
  }
}
