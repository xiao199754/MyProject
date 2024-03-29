package com.java.chengma.controller;

import com.java.chengma.entity.TbQuestionTag;
import com.java.chengma.entity.TbTag;
import com.java.chengma.service.TbQuestionTagService;
import com.java.chengma.service.TbTagService;
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
public class TbTagController {

    @Autowired
    private TbTagService tbtagService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search4")
    public List<TbQuestionTag> queryList(@RequestBody TbTag tbTag){
        List<TbTag> tbtags = tbtagService.queryList(tbTag);

        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbtags,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;

    }

}
