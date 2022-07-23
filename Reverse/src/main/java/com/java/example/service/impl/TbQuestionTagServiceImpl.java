package com.java.example.service.impl;

import com.java.example.entity.TbQuestionTag;
import com.java.example.dao.TbQuestionTagDao;
import com.java.example.service.TbQuestionTagService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 问题标签关联表(TbQuestionTag)表服务实现类
 *
 * @author makejava
 * @since 2022-07-21 21:06:09
 */
@Service("tbQuestionTagService")
public class TbQuestionTagServiceImpl implements TbQuestionTagService {
    @Resource
    private TbQuestionTagDao tbQuestionTagDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    @Override
    public TbQuestionTag queryById(Integer tagId) {
        return this.tbQuestionTagDao.queryById(tagId);
    }

    /**
     * 分页查询
     *
     * @param tbQuestionTag 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TbQuestionTag> queryByPage(TbQuestionTag tbQuestionTag, PageRequest pageRequest) {
        long total = this.tbQuestionTagDao.count(tbQuestionTag);
        return new PageImpl<>(this.tbQuestionTagDao.queryAllByLimit(tbQuestionTag, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tbQuestionTag 实例对象
     * @return 实例对象
     */
    @Override
    public TbQuestionTag insert(TbQuestionTag tbQuestionTag) {
        this.tbQuestionTagDao.insert(tbQuestionTag);
        return tbQuestionTag;
    }

    /**
     * 修改数据
     *
     * @param tbQuestionTag 实例对象
     * @return 实例对象
     */
    @Override
    public TbQuestionTag update(TbQuestionTag tbQuestionTag) {
        this.tbQuestionTagDao.update(tbQuestionTag);
        return this.queryById(tbQuestionTag.getTagId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tagId) {
        return this.tbQuestionTagDao.deleteById(tagId) > 0;
    }
}
