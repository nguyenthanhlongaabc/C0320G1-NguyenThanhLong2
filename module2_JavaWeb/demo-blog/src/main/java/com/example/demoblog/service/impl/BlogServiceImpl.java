package com.example.demoblog.service.impl;

import com.example.demoblog.entity.Blog;
import com.example.demoblog.repository.BlogRepository;
import com.example.demoblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Page<Blog> findAllBlogByName(String name, Pageable pageable) {
        return blogRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Blog> findAllBlog(Pageable pageable) {
        return blogRepository.findByOrderByName(pageable);
    }

    @Override
    public void deleteBlogById(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog getBlogById(int id) {
        return blogRepository.findById(id).orElse(null);
    }
}
