package com.java.example.entity;

import java.io.Serializable;

/**
 * 富文本表(TbEditorData)实体类
 *
 * @author makejava
 * @since 2022-07-21 20:56:30
 */
public class TbEditorData implements Serializable {
    private static final long serialVersionUID = 314412712631888771L;
    /**
     * ID
     */
    private Integer id;
    /**
     * html渲染数据
     */
    private String html;
    /**
     * 编辑器渲染数据
     */
    private String raw;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

}

