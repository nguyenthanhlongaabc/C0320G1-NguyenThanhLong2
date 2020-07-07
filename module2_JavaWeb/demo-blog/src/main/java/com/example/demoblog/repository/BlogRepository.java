package com.example.demoblog.repository;

import com.example.demoblog.entity.Blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findByOrderByName(Pageable pageable);
}
