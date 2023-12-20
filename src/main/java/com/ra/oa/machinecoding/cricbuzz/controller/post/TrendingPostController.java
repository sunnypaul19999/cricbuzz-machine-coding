package com.ra.oa.machinecoding.cricbuzz.controller.post;

import com.ra.oa.machinecoding.cricbuzz.model.post.Post;
import com.ra.oa.machinecoding.cricbuzz.service.post.trending.TrendingPostService;
import com.ra.oa.machinecoding.cricbuzz.valuepojo.rest.response.TrendingPostsResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts/trending")
public class TrendingPostController {

  @Autowired private TrendingPostService trendingPostService;

  @GetMapping("/")
  public TrendingPostsResponse getAllTrendingPosts() {
    final TrendingPostsResponse trendingPostsResponse = new TrendingPostsResponse();
    trendingPostsResponse.setVideos(getTrendingVideos());
    trendingPostsResponse.setEditorials(getTrendingEditorials());
    trendingPostsResponse.setFeatured(getFeaturedPosts());
    return trendingPostsResponse;
  }

  @GetMapping("/videos")
  public List<Post> getTrendingVideos() {
    return trendingPostService.getTrendingVideos();
  }

  @GetMapping("/editorials")
  public List<Post> getTrendingEditorials() {
    return trendingPostService.getTrendingEditorials();
  }

  @GetMapping("/featured")
  public List<Post> getFeaturedPosts() {
    return trendingPostService.getFeaturedPosts();
  }
}
