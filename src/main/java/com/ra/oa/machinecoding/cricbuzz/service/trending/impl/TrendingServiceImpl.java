package com.ra.oa.machinecoding.cricbuzz.service.trending.impl;

import com.ra.oa.machinecoding.cricbuzz.model.Post;
import com.ra.oa.machinecoding.cricbuzz.repository.PostRepository;
import com.ra.oa.machinecoding.cricbuzz.service.trending.TrendingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TrendingServiceImpl implements TrendingService {

  @Autowired private PostRepository postRepository;

  public List<Post> getTrendingVideos() {
    return postRepository.findTopPosts(1, 10);
  }

  public List<Post> getTrendingEditorials() {
    return postRepository.findTopPosts(2, 10);
  }

  public List<Post> getFeaturedPosts() {
    return postRepository
        .findAll(PageRequest.of(0, 10, Sort.by(Sort.Order.desc("viewCount"))))
        .stream()
        .toList();
  }
}
