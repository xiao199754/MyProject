package com.java.example.dao;

import com.java.example.entity.TbQuestionTag;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 问题标签关联表(TbQuestionTag)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-21 21:06:04
 */
public interface TbQuestionTagDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    TbQuestionTag queryById(Integer tagId);

    /**
     * 查询指定行数据
     *
     * @param tbQuestionTag 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TbQuestionTag> queryAllByLimit(TbQuestionTag tbQuestionTag, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tbQuestionTag 查询条件
     * @return 总行数
     */
    long count(TbQuestionTag tbQuestionTag);

    /**
     * 新增数据
     *
     * @param tbQuestionTag 实例对象
     * @return 影响行数
     */
    int insert(TbQuestionTag tbQuestionTag);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbQuestionTag> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbQuestionTag> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbQuestionTag> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbQuestionTag> entities);

    /**
     * 修改数据
     *
     * @param tbQuestionTag 实例对象
     * @return 影响行数
     */
    int update(TbQuestionTag tbQuestionTag);

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 影响行数
     */
    int deleteById(Integer tagId);

}

