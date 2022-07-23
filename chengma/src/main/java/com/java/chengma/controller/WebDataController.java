package com.java.chengma.controller;

import com.java.chengma.entity.TbEditorData;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.entity.TbTag;
import com.java.chengma.entity.TbUserVisitedQuestion;
import com.java.chengma.service.WebDataService;
import com.java.chengma.util.JsonDateValueProcessor;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/chengma")
public class WebDataController {

    @Autowired
    private WebDataService webDataService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/webData")
    public List<TbQuestion> queryListTbQuestion(@RequestBody TbQuestion tbQuestion){

        List<TbQuestion> tbQuestions = webDataService.queryListTbQuestion(tbQuestion);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbQuestions,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

    @PostMapping(value = "/webDataTbTag")
    public List<TbTag> queryListTbTag(@RequestBody TbTag tbTag){

        List<TbTag> tbTags = webDataService.queryListTbTag(tbTag);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbTags,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

    @PostMapping(value = "/webDataUserVisitedQuestion")
    public Long queryListCount(@RequestBody TbUserVisitedQuestion tbUserVisitedQuestion){

        Long listCount = webDataService.queryListCount(tbUserVisitedQuestion);
        System.out.println(listCount);
        return listCount;

    }

    @PostMapping(value = "/webDataTbEditorData")
    public List<TbEditorData> queryListTbEditorData(@RequestBody TbEditorData tbEditorData){

        List<TbEditorData> tbEditorDatas = webDataService.queryListTbEditorData(tbEditorData);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbEditorDatas,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

    @PostMapping(value = "/webDataTbEditorDataAndComment")
    public List<TbEditorData> queryListTbEditorDataAndComment(@RequestBody TbEditorData tbEditorData){

        List<TbEditorData> tbEditorDatas = webDataService.queryListTbEditorDataAndComment(tbEditorData);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbEditorDatas,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }
}
