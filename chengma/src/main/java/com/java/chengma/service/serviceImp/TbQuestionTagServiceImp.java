package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.entity.TbQuestionTag;
import com.java.chengma.mapper.TbQuestionMapper;
import com.java.chengma.mapper.TbQuestionTagMapper;
import com.java.chengma.service.TbQuestionService;
import com.java.chengma.service.TbQuestionTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbQuestionTagServiceImp extends MppServiceImpl<TbQuestionTagMapper,TbQuestionTag> implements TbQuestionTagService {

    @Autowired
    private TbQuestionTagMapper tbQuestionTagMapper;

    @Override
    public List<TbQuestionTag> queryList(TbQuestionTag tbQuestionTag) {
        //条件包装对象
        QueryWrapper<TbQuestionTag> queryWrapper = new QueryWrapper<TbQuestionTag>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("question_id",tbQuestionTag.getQuestionId());
        return tbQuestionTagMapper.selectList(queryWrapper);
    }
}
