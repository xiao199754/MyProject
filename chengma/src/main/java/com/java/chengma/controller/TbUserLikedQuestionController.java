package com.java.chengma.controller;

import com.java.chengma.entity.TbUserLikedComment;
import com.java.chengma.entity.TbUserLikedQuestion;
import com.java.chengma.service.TbUserLikedCommentService;
import com.java.chengma.service.TbUserLikedQuestionService;
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
public class TbUserLikedQuestionController {

    @Autowired
    private TbUserLikedQuestionService tbUserLikedQuestionService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search8")
    public List<TbUserLikedQuestion> queryList(@RequestBody TbUserLikedQuestion tbUserLikedQuestion){
        List<TbUserLikedQuestion> tbUserLikedQuestions = tbUserLikedQuestionService.queryList(tbUserLikedQuestion);
        System.out.println(tbUserLikedQuestions.get(0).getUsername());
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbUserLikedQuestions,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

}
