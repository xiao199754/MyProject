package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbUserLikedQuestion;
import com.java.chengma.entity.TbUserVisitedQuestion;
import com.java.chengma.mapper.TbUserLikedQuestionMapper;
import com.java.chengma.mapper.TbUserVisitedQuestionMapper;
import com.java.chengma.service.TbUserLikedQuestionService;
import com.java.chengma.service.TbUserVisitedQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserVisitedQuestionServiceImp extends MppServiceImpl<TbUserVisitedQuestionMapper, TbUserVisitedQuestion> implements TbUserVisitedQuestionService {

    @Autowired
    private TbUserVisitedQuestionMapper tbUserVisitedQuestionMapper;

    @Override
    public List<TbUserVisitedQuestion> queryList(TbUserVisitedQuestion tbUserVisitedQuestion) {
        //条件包装对象
        QueryWrapper<TbUserVisitedQuestion> queryWrapper = new QueryWrapper<TbUserVisitedQuestion>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("question_id",tbUserVisitedQuestion.getQuestionId());
        return tbUserVisitedQuestionMapper.selectList(queryWrapper);
    }

    @Override
    public Long queryListCount(TbUserVisitedQuestion tbUserVisitedQuestion) {
        //条件包装对象
        QueryWrapper<TbUserVisitedQuestion> queryWrapper = new QueryWrapper<TbUserVisitedQuestion>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("question_id",tbUserVisitedQuestion.getQuestionId());
        return tbUserVisitedQuestionMapper.selectCount(queryWrapper);
    }
}
