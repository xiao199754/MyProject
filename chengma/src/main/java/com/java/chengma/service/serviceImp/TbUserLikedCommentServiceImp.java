package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbUserCollectedQuestion;
import com.java.chengma.entity.TbUserLikedComment;
import com.java.chengma.mapper.TbUserCollectedQuestionMapper;
import com.java.chengma.mapper.TbUserLikedCommentMapper;
import com.java.chengma.service.TbUserCollectedQuestionService;
import com.java.chengma.service.TbUserLikedCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserLikedCommentServiceImp extends MppServiceImpl<TbUserLikedCommentMapper, TbUserLikedComment> implements TbUserLikedCommentService {

    @Autowired
    private TbUserLikedCommentMapper tbUserLikedCommentMapper;

    @Override
    public List<TbUserLikedComment> queryList(TbUserLikedComment tbUserLikedComment) {
        //条件包装对象
        QueryWrapper<TbUserLikedComment> queryWrapper = new QueryWrapper<TbUserLikedComment>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("comment_id",tbUserLikedComment.getCommentId());
        return tbUserLikedCommentMapper.selectList(queryWrapper);
    }
}
