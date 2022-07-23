package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.java.chengma.mapper.TbQuestionMapper;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.service.TbQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbQuestionServiceImp extends MppServiceImpl<TbQuestionMapper,TbQuestion> implements TbQuestionService {

    @Autowired
    private TbQuestionMapper tbQuestionMapper;

    @Override
    public List<TbQuestion> queryList(TbQuestion tbQuestion) {
        //条件包装对象
        QueryWrapper<TbQuestion> queryWrapper = new QueryWrapper<TbQuestion>();
        //根据 title 模糊查询
        //queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        queryWrapper.eq("id",tbQuestion.getId());
        return tbQuestionMapper.selectList(queryWrapper);
    }

    @Override
    public List<TbQuestion> queryListLike(TbQuestion tbQuestion) {
        //条件包装对象
        QueryWrapper<TbQuestion> queryWrapper = new QueryWrapper<TbQuestion>();
        //根据 title 模糊查询
        queryWrapper.like("title",tbQuestion.getTitle());

        //根据id查询
        //queryWrapper.eq("id",tbQuestion.getId());
        return tbQuestionMapper.selectList(queryWrapper);
    }
}
