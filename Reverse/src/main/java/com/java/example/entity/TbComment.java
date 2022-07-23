package com.java.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 评论表(TbComment)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:14:18
 */
public class TbComment implements Serializable {
    private static final long serialVersionUID = -39429387012394822L;
    
    private Integer id;
    /**
     * 评论，关联tb_editor_data
     */
    private Integer comment;
    /**
     * 评论的question
     */
    private String questionId;
    /**
     * 回复的评论ID，为0则为问题的首评
     */
    private Integer replyId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建用户
     */
    private String createUser;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

}

