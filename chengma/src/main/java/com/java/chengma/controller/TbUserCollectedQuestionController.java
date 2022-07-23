package com.java.chengma.controller;

import com.java.chengma.entity.TbUserCollectedComment;
import com.java.chengma.entity.TbUserCollectedQuestion;
import com.java.chengma.service.TbUserCollectedCommentService;
import com.java.chengma.service.TbUserCollectedQuestionService;
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
public class TbUserCollectedQuestionController {

    @Autowired
    private TbUserCollectedQuestionService tbUserCollectedQuestionService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search6")
    public List<TbUserCollectedQuestion> queryList(@RequestBody TbUserCollectedQuestion tbUserCollectedQuestion){
        List<TbUserCollectedQuestion> tbUserCollectedQuestions = tbUserCollectedQuestionService.queryList(tbUserCollectedQuestion);

        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbUserCollectedQuestions,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

}
