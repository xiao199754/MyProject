package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbTag;

import java.util.List;

public interface TbTagService extends IMppService<TbTag> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbTag> queryList(TbTag tbTag);

}
