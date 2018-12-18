package com.github.expdev07.repository;

import com.github.expdev07.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repository for posts
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}