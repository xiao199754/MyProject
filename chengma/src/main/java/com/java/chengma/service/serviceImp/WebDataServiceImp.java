package com.java.chengma.service.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.chengma.entity.TbEditorData;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.entity.TbTag;
import com.java.chengma.entity.TbUserVisitedQuestion;
import com.java.chengma.mapper.WebDataMapper;
import com.java.chengma.service.WebDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebDataServiceImp implements WebDataService {

    @Autowired
    private WebDataMapper webDataMapper;


    @Override
    public List<TbQuestion> queryListTbQuestion(TbQuestion tbQuestion) {
        return webDataMapper.queryListTbQuestion(tbQuestion);
    }

    @Override
    public List<TbTag> queryListTbTag(TbTag tbTag) {
        return webDataMapper.queryListTbTag(tbTag);
    }

    @Override
    public Long queryListCount(TbUserVisitedQuestion tbUserVisitedQuestion) {
        return webDataMapper.queryListCount(tbUserVisitedQuestion);
    }

    @Override
    public List<TbEditorData> queryListTbEditorData(TbEditorData tbEditorData) {
        return webDataMapper.queryListTbEditorData(tbEditorData);
    }

    @Override
    public List<TbEditorData> queryListTbEditorDataAndComment(TbEditorData tbEditorData) {
        return webDataMapper.queryListTbEditorDataAndComment(tbEditorData);
    }
}
