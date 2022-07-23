package com.java.example.entity;

import java.io.Serializable;

/**
 * 问题标签关联表(TbQuestionTag)实体类
 *
 * @author makejava
 * @since 2022-07-21 21:06:05
 */
public class TbQuestionTag implements Serializable {
    private static final long serialVersionUID = 767036526604611704L;
    /**
     * 标签ID
     */
    private Integer tagId;
    /**
     * 问题ID
     */
    private String questionId;


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

}

