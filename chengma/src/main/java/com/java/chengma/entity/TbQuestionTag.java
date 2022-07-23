package com.java.chengma.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 问题标签关联表(TbQuestionTag)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:31:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_question_tag")
public class TbQuestionTag implements Serializable {


    /**
     * 标签ID
     */
    @MppMultiId
    @TableField(value = "tag_id")
    private Integer tagId;
    /**
     * 问题ID
     */
    @MppMultiId
    @TableField(value = "question_id")
    private String questionId;

}

