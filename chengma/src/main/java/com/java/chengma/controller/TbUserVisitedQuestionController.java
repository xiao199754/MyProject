package com.java.chengma.controller;

import com.java.chengma.entity.TbUserLikedQuestion;
import com.java.chengma.entity.TbUserVisitedQuestion;
import com.java.chengma.service.TbUserLikedQuestionService;
import com.java.chengma.service.TbUserVisitedQuestionService;
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
public class TbUserVisitedQuestionController {

    @Autowired
    private TbUserVisitedQuestionService tbUserVisitedQuestionService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search9")
    public List<TbUserVisitedQuestion> queryList(@RequestBody TbUserVisitedQuestion tbUserVisitedQuestion){
        List<TbUserVisitedQuestion> tbUserVisitedQuestions = tbUserVisitedQuestionService.queryList(tbUserVisitedQuestion);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbUserVisitedQuestions,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/search10")
    public long queryListCount(@RequestBody TbUserVisitedQuestion tbUserVisitedQuestion){
        long longCount = tbUserVisitedQuestionService.queryListCount(tbUserVisitedQuestion);
        System.out.println(longCount);
        return longCount;

    }

}
