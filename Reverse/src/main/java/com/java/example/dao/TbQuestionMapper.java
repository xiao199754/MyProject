package com.java.example.dao;

import com.java.example.entity.TbQuestion;

public interface TbQuestionMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbQuestion record);

    int insertSelective(TbQuestion record);

    TbQuestion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbQuestion record);

    int updateByPrimaryKey(TbQuestion record);
}