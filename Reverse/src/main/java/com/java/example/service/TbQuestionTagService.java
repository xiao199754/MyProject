package com.java.example.service;

import com.java.example.entity.TbQuestionTag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 问题标签关联表(TbQuestionTag)表服务接口
 *
 * @author makejava
 * @since 2022-07-21 21:06:08
 */
public interface TbQuestionTagService {

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    TbQuestionTag queryById(Integer tagId);

    /**
     * 分页查询
     *
     * @param tbQuestionTag 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TbQuestionTag> queryByPage(TbQuestionTag tbQuestionTag, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tbQuestionTag 实例对象
     * @return 实例对象
     */
    TbQuestionTag insert(TbQuestionTag tbQuestionTag);

    /**
     * 修改数据
     *
     * @param tbQuestionTag 实例对象
     * @return 实例对象
     */
    TbQuestionTag update(TbQuestionTag tbQuestionTag);

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tagId);

}
