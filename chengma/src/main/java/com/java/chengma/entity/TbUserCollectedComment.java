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
 * 用户收藏评论记录表(TbUserCollectedComment)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:32:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user_collected_comment")
public class TbUserCollectedComment implements Serializable {

    /**
     * 用户
     */
    @MppMultiId
    private String username;

    /**
     * 评论ID
     */
    @MppMultiId
    @TableField(value = "comment_id")
    private Integer commentId;


}

