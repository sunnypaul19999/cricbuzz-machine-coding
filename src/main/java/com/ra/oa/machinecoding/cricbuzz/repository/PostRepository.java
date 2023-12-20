package com.ra.oa.machinecoding.cricbuzz.repository;

import com.ra.oa.machinecoding.cricbuzz.model.Post;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Integer> {
  @Query(
      value = "SELECT * from post where post.post_type_id = ? order by view_count desc limit ?",
      nativeQuery = true)
  List<Post> findTopPosts(int postTypeId, int top);

  List<Post> findByPostTypeIdOrderByViewCountDesc(long postTypeId, Pageable pageable);
}
