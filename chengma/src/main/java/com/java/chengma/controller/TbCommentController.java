package com.java.chengma.controller;

import com.java.chengma.entity.TbComment;
import com.java.chengma.service.TbCommentService;
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
public class TbCommentController {

    @Autowired
    private TbCommentService tbCommentService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search1")
    public List<TbComment> queryList(@RequestBody TbComment tbComment){
        List<TbComment> tbComments = tbCommentService.queryList(tbComment);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbComments,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;
    }

}
