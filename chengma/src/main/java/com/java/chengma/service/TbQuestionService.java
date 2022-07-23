package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbEditorData;
import com.java.chengma.entity.TbQuestion;

import java.util.List;

public interface TbQuestionService extends IMppService<TbQuestion> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbQuestion> queryList(TbQuestion tbQuestion);

    List<TbQuestion> queryListLike(TbQuestion tbQuestion);

}
