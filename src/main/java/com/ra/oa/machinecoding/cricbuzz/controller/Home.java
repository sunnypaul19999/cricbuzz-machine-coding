package com.ra.oa.machinecoding.cricbuzz.controller;

import com.ra.oa.machinecoding.cricbuzz.model.Post;
import com.ra.oa.machinecoding.cricbuzz.service.premiumplan.PremiumPlanService;
import com.ra.oa.machinecoding.cricbuzz.service.trending.TrendingService;
import com.ra.oa.machinecoding.cricbuzz.valuepojo.rest.response.TrendingPostsResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Home {

  @Autowired private TrendingService trendingService;

  @Autowired private PremiumPlanService premiumPlanService;

  @GetMapping("/premium-plans/**")
  public Object getPremiumPlans() {
    return premiumPlanService.getAllPremiumPlans();
  }

  @GetMapping("/trending/**")
  public TrendingPostsResponse getAllTrendingPosts() {
    final TrendingPostsResponse trendingPostsResponse = new TrendingPostsResponse();
    trendingPostsResponse.setVideos(getTrendingVideos());
    trendingPostsResponse.setEditorials(getTrendingEditorials());
    trendingPostsResponse.setFeatured(getFeaturedPosts());
    return trendingPostsResponse;
  }

  @GetMapping("/trending/videos/**")
  public List<Post> getTrendingVideos() {
    return trendingService.getTrendingVideos();
  }

  @GetMapping("/trending/editorials/**")
  public List<Post> getTrendingEditorials() {
    return trendingService.getTrendingEditorials();
  }

  @GetMapping("/trending/featured/**")
  public List<Post> getFeaturedPosts() {
    return trendingService.getFeaturedPosts();
  }
}
