package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.entity.TbTag;
import com.java.chengma.entity.TbUserCollectedComment;
import com.java.chengma.mapper.TbTagMapper;
import com.java.chengma.mapper.TbUserCollectedCommentMapper;
import com.java.chengma.service.TbTagService;
import com.java.chengma.service.TbUserCollectedCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserCollectedCommentServiceImp extends MppServiceImpl<TbUserCollectedCommentMapper, TbUserCollectedComment> implements TbUserCollectedCommentService {

    @Autowired
    private TbUserCollectedCommentMapper tbUserCollectedCommentMapper;

    @Override
    public List<TbUserCollectedComment> queryList(TbUserCollectedComment tbUserCollectedComment) {
        //条件包装对象
        QueryWrapper<TbUserCollectedComment> queryWrapper = new QueryWrapper<TbUserCollectedComment>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("comment_id",tbUserCollectedComment.getCommentId());
        return tbUserCollectedCommentMapper.selectList(queryWrapper);
    }

}
