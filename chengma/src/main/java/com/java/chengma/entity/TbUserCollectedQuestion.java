package com.java.chengma.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户收藏问题记录表(TbUserCollectedQuestion)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:33:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user_collected_question")
public class TbUserCollectedQuestion implements Serializable {

    /**
     * 用户
     */
    @MppMultiId
    private String username;

    /**
     * 问题ID
     */
    @MppMultiId
    @TableField(value = "question_id")
    private String questionId;

    @TableField(value = "create_time")
    private Date createTime;


}

