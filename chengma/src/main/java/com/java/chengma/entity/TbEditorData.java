package com.java.chengma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 富文本表(TbEditorData)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:29:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_editor_data")
public class TbEditorData implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * html渲染数据
     */
    private String html;
    /**
     * 编辑器渲染数据
     */
    private String raw;

}

