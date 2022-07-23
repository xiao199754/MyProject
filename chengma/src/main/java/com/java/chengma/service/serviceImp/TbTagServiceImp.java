package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbQuestionTag;
import com.java.chengma.entity.TbTag;
import com.java.chengma.mapper.TbQuestionTagMapper;
import com.java.chengma.mapper.TbTagMapper;
import com.java.chengma.service.TbQuestionTagService;
import com.java.chengma.service.TbTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbTagServiceImp extends MppServiceImpl<TbTagMapper, TbTag> implements TbTagService {

    @Autowired
    private TbTagMapper tbTagMapper;

    @Override
    public List<TbTag> queryList(TbTag tbTag) {
        //条件包装对象
        QueryWrapper<TbTag> queryWrapper = new QueryWrapper<TbTag>();

        //根据id查询
        queryWrapper.in("id",tbTag.getId());
        return tbTagMapper.selectList(queryWrapper);
    }

}
