package com.java.blog.service;

import com.java.blog.po.Blog;
import com.java.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    List<Blog> listBlogRecommendTop(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Long blogCount();

    Blog saveBlog(Blog blog);

    void deleteBlog(Long id);

}
