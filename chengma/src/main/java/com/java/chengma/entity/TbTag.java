package com.java.chengma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 标签表(TbTag)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:31:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_tag")
public class TbTag implements Serializable {

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private String id;
    /**
     * 标签值
     */
    private String label;
    /**
     * 点击次数
     */
    private Integer count;
    /**
     * 分类
     */
    private String category;

}

