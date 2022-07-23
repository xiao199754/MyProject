package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbComment;

import java.util.List;

public interface TbCommentService extends IMppService<TbComment> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbComment> queryList(TbComment tbComment);
}
