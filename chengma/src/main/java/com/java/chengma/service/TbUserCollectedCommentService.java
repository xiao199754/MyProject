package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbTag;
import com.java.chengma.entity.TbUserCollectedComment;

import java.util.List;

public interface TbUserCollectedCommentService extends IMppService<TbUserCollectedComment> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbUserCollectedComment> queryList(TbUserCollectedComment tbUserCollectedComment);

}
