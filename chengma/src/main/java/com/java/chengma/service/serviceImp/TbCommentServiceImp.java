package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbComment;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.mapper.TbCommentMapper;
import com.java.chengma.mapper.TbQuestionMapper;
import com.java.chengma.service.TbCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbCommentServiceImp extends MppServiceImpl<TbCommentMapper,TbComment> implements TbCommentService {

    @Autowired
    private TbCommentMapper tbCommentMapper;

    @Override
    public List<TbComment> queryList(TbComment tbComment) {
        //条件包装对象
        QueryWrapper<TbComment> queryWrapper = new QueryWrapper<TbComment>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("question_id",tbComment.getQuestionId());
        return tbCommentMapper.selectList(queryWrapper);
    }
}
