package com.ra.oa.machinecoding.cricbuzz.service.post.trending;

import com.ra.oa.machinecoding.cricbuzz.model.post.Post;
import java.util.List;

public interface TrendingPostService {
  List<Post> getTrendingVideos();

  List<Post> getTrendingEditorials();

  List<Post> getFeaturedPosts();
}
