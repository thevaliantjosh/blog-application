package com.example.blogapplication.repositories;

import com.example.blogapplication.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
