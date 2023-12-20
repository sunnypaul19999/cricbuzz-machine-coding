package com.ra.oa.machinecoding.cricbuzz.valuepojo.rest.response;

import com.ra.oa.machinecoding.cricbuzz.model.post.Post;
import java.util.List;

public class TrendingPostsResponse {
  private List<Post> videos;
  private List<Post> editorials;
  private List<Post> featured;

  public List<Post> getVideos() {
    return videos;
  }

  public void setVideos(List<Post> videos) {
    this.videos = videos;
  }

  public List<Post> getEditorials() {
    return editorials;
  }

  public void setEditorials(List<Post> editorials) {
    this.editorials = editorials;
  }

  public List<Post> getFeatured() {
    return featured;
  }

  public void setFeatured(List<Post> featured) {
    this.featured = featured;
  }
}
