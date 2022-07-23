package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbUserCollectedQuestion;
import com.java.chengma.entity.TbUserLikedComment;

import java.util.List;

public interface TbUserLikedCommentService extends IMppService<TbUserLikedComment> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbUserLikedComment> queryList(TbUserLikedComment tbUserLikedComment);

}
