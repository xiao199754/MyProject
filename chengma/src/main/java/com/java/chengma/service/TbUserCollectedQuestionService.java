package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbUserCollectedComment;
import com.java.chengma.entity.TbUserCollectedQuestion;

import java.util.List;

public interface TbUserCollectedQuestionService extends IMppService<TbUserCollectedQuestion> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbUserCollectedQuestion> queryList(TbUserCollectedQuestion tbUserCollectedQuestion);

}
