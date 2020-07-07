package com.example.demoblog.service;

import com.example.demoblog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAllBlogByName(String name, Pageable pageable);
    Page<Blog> findAllBlog(Pageable pageable);
    void deleteBlogById(int id);
    void saveBlog(Blog blog);
    Blog getBlogById(int id);
}
