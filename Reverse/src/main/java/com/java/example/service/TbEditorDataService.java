package com.java.example.service;

import com.java.example.entity.TbEditorData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 富文本表(TbEditorData)表服务接口
 *
 * @author makejava
 * @since 2022-07-21 20:56:30
 */
public interface TbEditorDataService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbEditorData queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tbEditorData 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TbEditorData> queryByPage(TbEditorData tbEditorData, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tbEditorData 实例对象
     * @return 实例对象
     */
    TbEditorData insert(TbEditorData tbEditorData);

    /**
     * 修改数据
     *
     * @param tbEditorData 实例对象
     * @return 实例对象
     */
    TbEditorData update(TbEditorData tbEditorData);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
