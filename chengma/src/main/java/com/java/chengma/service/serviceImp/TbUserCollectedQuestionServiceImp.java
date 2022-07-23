package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbUserCollectedComment;
import com.java.chengma.entity.TbUserCollectedQuestion;
import com.java.chengma.mapper.TbUserCollectedCommentMapper;
import com.java.chengma.mapper.TbUserCollectedQuestionMapper;
import com.java.chengma.service.TbUserCollectedCommentService;
import com.java.chengma.service.TbUserCollectedQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserCollectedQuestionServiceImp extends MppServiceImpl<TbUserCollectedQuestionMapper, TbUserCollectedQuestion> implements TbUserCollectedQuestionService {

    @Autowired
    private TbUserCollectedQuestionMapper tbUserCollectedQuestionMapper;

    @Override
    public List<TbUserCollectedQuestion> queryList(TbUserCollectedQuestion tbUserCollectedQuestion) {
        //条件包装对象
        QueryWrapper<TbUserCollectedQuestion> queryWrapper = new QueryWrapper<TbUserCollectedQuestion>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("question_id",tbUserCollectedQuestion.getQuestionId());
        return tbUserCollectedQuestionMapper.selectList(queryWrapper);
    }
}
