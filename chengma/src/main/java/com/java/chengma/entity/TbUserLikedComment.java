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
 * 用户点赞评论表(TbUserLikedComment)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:33:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user_liked_comment")
public class TbUserLikedComment implements Serializable {

    /**
     * 用户
     */
    @MppMultiId
    private String username;

    /**
     * 评论id
     */
    @MppMultiId
    @TableField(value = "comment_id")
    private Integer commentId;

}

