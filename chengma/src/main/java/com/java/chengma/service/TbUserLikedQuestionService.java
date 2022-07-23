package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbUserLikedComment;
import com.java.chengma.entity.TbUserLikedQuestion;

import java.util.List;

public interface TbUserLikedQuestionService extends IMppService<TbUserLikedQuestion> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbUserLikedQuestion> queryList(TbUserLikedQuestion tbUserLikedQuestion);

}
