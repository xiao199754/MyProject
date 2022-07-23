package com.java.example.entity;

import java.util.Date;

public class TbQuestion {
    private String id;

    private String title;

    private String tags;

    private Integer question;

    private Integer answer;

    private Boolean status;

    private String answerer;

    private Boolean classic;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private Boolean deleteFlag;

    public TbQuestion(String id, String title, String tags, Integer question, Integer answer, Boolean status, String answerer, Boolean classic, String createUser, Date createTime, String updateUser, Date updateTime, Boolean deleteFlag) {
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.question = question;
        this.answer = answer;
        this.status = status;
        this.answerer = answerer;
        this.classic = classic;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.deleteFlag = deleteFlag;
    }

    public TbQuestion() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAnswerer() {
        return answerer;
    }

    public void setAnswerer(String answerer) {
        this.answerer = answerer == null ? null : answerer.trim();
    }

    public Boolean getClassic() {
        return classic;
    }

    public void setClassic(Boolean classic) {
        this.classic = classic;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}