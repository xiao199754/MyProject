package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbComment;
import com.java.chengma.entity.TbEditorData;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.mapper.TbCommentMapper;
import com.java.chengma.mapper.TbEditorDataMapper;
import com.java.chengma.mapper.TbQuestionMapper;
import com.java.chengma.service.TbCommentService;
import com.java.chengma.service.TbEditorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbEditorDataServiceImp extends MppServiceImpl<TbEditorDataMapper, TbEditorData> implements TbEditorDataService {

    @Autowired
    private TbEditorDataMapper tbEditorDataMapper;

    @Override
    public List<TbEditorData> queryList(TbEditorData tbEditorData) {
        //条件包装对象
        QueryWrapper<TbEditorData> queryWrapper = new QueryWrapper<TbEditorData>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("id",tbEditorData.getId());
        return tbEditorDataMapper.selectList(queryWrapper);
    }
}
