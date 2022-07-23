package com.java.example.service.impl;

import com.java.example.entity.TbEditorData;
import com.java.example.dao.TbEditorDataDao;
import com.java.example.service.TbEditorDataService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 富文本表(TbEditorData)表服务实现类
 *
 * @author makejava
 * @since 2022-07-21 20:56:33
 */
@Service("tbEditorDataService")
public class TbEditorDataServiceImpl implements TbEditorDataService {
    @Resource
    private TbEditorDataDao tbEditorDataDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbEditorData queryById(Integer id) {
        return this.tbEditorDataDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tbEditorData 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TbEditorData> queryByPage(TbEditorData tbEditorData, PageRequest pageRequest) {
        long total = this.tbEditorDataDao.count(tbEditorData);
        return new PageImpl<>(this.tbEditorDataDao.queryAllByLimit(tbEditorData, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tbEditorData 实例对象
     * @return 实例对象
     */
    @Override
    public TbEditorData insert(TbEditorData tbEditorData) {
        this.tbEditorDataDao.insert(tbEditorData);
        return tbEditorData;
    }

    /**
     * 修改数据
     *
     * @param tbEditorData 实例对象
     * @return 实例对象
     */
    @Override
    public TbEditorData update(TbEditorData tbEditorData) {
        this.tbEditorDataDao.update(tbEditorData);
        return this.queryById(tbEditorData.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbEditorDataDao.deleteById(id) > 0;
    }
}
