package com.java.chengma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 评论表(TbComment)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:27:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_comment")
public class TbComment implements Serializable {

    @TableId(type=IdType.AUTO)
    private Integer id;
    /**
     * 评论，关联tb_editor_data
     */
    private Integer comment;
    /**
     * 评论的question
     */
    @TableField(value = "question_id")
    private String questionId;
    /**
     * 回复的评论ID，为0则为问题的首评
     */
    @TableField(value = "reply_id")
    private Integer replyId;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 创建用户
     */
    @TableField(value = "create_user")
    private String createUser;

}

