package com.java.chengma.controller;

import com.java.chengma.entity.TbEditorData;
import com.java.chengma.service.TbEditorDataService;
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
public class TbEditorDataController {

    @Autowired
    private TbEditorDataService tbEditorDataService;

    /****
     * 条件查询
     */
    @PostMapping(value = "/search2")
    public List<TbEditorData> queryList(@RequestBody TbEditorData tbEditorData){
        List<TbEditorData> tbEditorDatas = tbEditorDataService.queryList(tbEditorData);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(tbEditorDatas,jsonConfig);
        System.out.println(jsonStr);
        return jsonStr;
    }

}
