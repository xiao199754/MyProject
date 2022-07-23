package com.java.chengma.service;

import com.java.chengma.entity.TbEditorData;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.entity.TbTag;
import com.java.chengma.entity.TbUserVisitedQuestion;

import java.util.List;

public interface WebDataService {

    /****
     * 条件查询
     */
    List<TbQuestion> queryListTbQuestion(TbQuestion tbQuestion);

    List<TbTag> queryListTbTag(TbTag tbTag);

    Long queryListCount(TbUserVisitedQuestion tbUserVisitedQuestion);

    List<TbEditorData> queryListTbEditorData(TbEditorData tbEditorData);

    List<TbEditorData> queryListTbEditorDataAndComment(TbEditorData tbEditorData);

}
