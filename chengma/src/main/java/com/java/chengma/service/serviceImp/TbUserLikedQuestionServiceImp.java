package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbUserLikedComment;
import com.java.chengma.entity.TbUserLikedQuestion;
import com.java.chengma.mapper.TbUserLikedCommentMapper;
import com.java.chengma.mapper.TbUserLikedQuestionMapper;
import com.java.chengma.service.TbUserLikedCommentService;
import com.java.chengma.service.TbUserLikedQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserLikedQuestionServiceImp extends MppServiceImpl<TbUserLikedQuestionMapper, TbUserLikedQuestion> implements TbUserLikedQuestionService {

    @Autowired
    private TbUserLikedQuestionMapper tbUserLikedQuestionMapper;

    @Override
    public List<TbUserLikedQuestion> queryList(TbUserLikedQuestion tbUserLikedQuestion) {
        //条件包装对象
        QueryWrapper<TbUserLikedQuestion> queryWrapper = new QueryWrapper<TbUserLikedQuestion>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("question_id",tbUserLikedQuestion.getQuestionId());
        return tbUserLikedQuestionMapper.selectList(queryWrapper);
    }
}
