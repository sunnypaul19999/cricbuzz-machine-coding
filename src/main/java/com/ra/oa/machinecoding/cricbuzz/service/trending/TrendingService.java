package com.ra.oa.machinecoding.cricbuzz.service.trending;

import com.ra.oa.machinecoding.cricbuzz.model.Post;
import java.util.List;

public interface TrendingService {
  List<Post> getTrendingVideos();

  List<Post> getTrendingEditorials();

  List<Post> getFeaturedPosts();
}
