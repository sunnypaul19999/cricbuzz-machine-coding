package com.ra.oa.machinecoding.cricbuzz.model.post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "post_summary")
public class PostSummary {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Getter(AccessLevel.NONE)
  @OneToOne
  @JoinColumn(name = "post_id")
  private Post post;

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

  @Column(name = "preview_image_link", nullable = false, length = 1000)
  private String previewImageLink;

  @Column(name = "post_link", nullable = false, length = 1000)
  private String postLink;
}
