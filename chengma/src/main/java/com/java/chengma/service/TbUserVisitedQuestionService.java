package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbUserLikedQuestion;
import com.java.chengma.entity.TbUserVisitedQuestion;

import java.util.List;

public interface TbUserVisitedQuestionService extends IMppService<TbUserVisitedQuestion> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbUserVisitedQuestion> queryList(TbUserVisitedQuestion tbUserVisitedQuestion);

    Long queryListCount(TbUserVisitedQuestion tbUserVisitedQuestion);

}
