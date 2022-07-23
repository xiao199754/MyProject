package com.java.chengma.controller;

import com.java.chengma.entity.TbQuestion;
import com.java.chengma.service.TbQuestionService;
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
public class TbQuestionController {

    @Autowired
    private TbQuestionService tbQuestionService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search")
    public List<TbQuestion> queryList(@RequestBody TbQuestion tbQuestion){
        List<TbQuestion> tbQuestions = tbQuestionService.queryList(tbQuestion);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbQuestions,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;
    }

    /****
     * 条件查询 like
     */
    @PostMapping(value = "/searchLike")
    public List<TbQuestion> queryListLike(@RequestBody TbQuestion tbQuestion){
        List<TbQuestion> tbQuestions = tbQuestionService.queryListLike(tbQuestion);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbQuestions,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;
    }

}
