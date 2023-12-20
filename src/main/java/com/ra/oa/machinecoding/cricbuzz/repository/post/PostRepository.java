package com.ra.oa.machinecoding.cricbuzz.repository.post;

import com.ra.oa.machinecoding.cricbuzz.model.post.Post;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

  List<Post> findByPostTypeId(long postTypeId, Pageable pageable);
}
