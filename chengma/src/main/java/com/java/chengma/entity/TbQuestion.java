package com.java.chengma.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题表(TbQuestion)实体类
 *
 * @author makejava
 * @since 2022-07-21 15:30:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_question")
public class TbQuestion implements Serializable {

    @TableId
    private String id;
    /**
     * 提问标题
     */
    private String title;
    /**
     * 标签，多个逗号分隔
     */
    private String tags;
    /**
     * 问题(关联tb_editor_data表)
     */
    private Integer question;
    /**
     * 答案(关联tb_editor_data表),未回答为0
     */
    private Integer answer;
    /**
     * 状态：1.已上架 0已下架
     */
    private Integer status;
    /**
     * 问题回复人
     */
    private String answerer;
    /**
     * 是否精品
     */
    private Integer classic;
    /**
     * 创建者
     */
    @TableField(value = "create_user")
    private String createUser;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 更新者
     */
    @TableField(value = "update_user")
    private String updateUser;

    @TableField(value = "update_time")
    private Date updateTime;
    /**
     * 是否删除，1为是，0为否
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

}

