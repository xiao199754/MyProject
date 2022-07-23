package com.java.chengma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import com.java.chengma.entity.TbComment;
import com.java.chengma.entity.TbEditorData;

import java.util.List;

public interface TbEditorDataService extends IMppService<TbEditorData> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<TbEditorData> queryList(TbEditorData tbEditorData);
}
