package com.java.blog.service;

import com.java.blog.po.Comment;
import com.java.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentService {

    /*根据博客的id查询关联的评论*/
    List<Comment> listCommentByBlogId(Long blogId);

    /*保存*/
    Comment saveComment(Comment comment);

    /*分页查询*/
    Page<Comment> listComment(Pageable pageable);

    /*删除*/
    void deleteComment(Long id);
}
