package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.entity.TbQuestionTag;

import java.util.List;

public interface TbQuestionTagService extends IMppService<TbQuestionTag> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbQuestionTag> queryList(TbQuestionTag tbQuestionTag);

}
