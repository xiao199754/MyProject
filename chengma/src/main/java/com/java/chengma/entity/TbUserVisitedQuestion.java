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
 * 用户浏览问题记录表(TbUserVisitedQuestion)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:33:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user_visited_question")
public class TbUserVisitedQuestion implements Serializable {

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 用户
     */
    private String username;
    /**
     * 问题ID
     */
    @TableField(value = "question_id")
    private String questionId;

    @TableField(value = "create_time")
    private Date createTime;

}

