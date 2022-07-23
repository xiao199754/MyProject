package com.java.example.controller;

import com.java.example.entity.TbEditorData;
import com.java.example.service.TbEditorDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 富文本表(TbEditorData)表控制层
 *
 * @author makejava
 * @since 2022-07-21 20:56:25
 */
@RestController
@RequestMapping("tbEditorData")
public class TbEditorDataController {
    /**
     * 服务对象
     */
    @Resource
    private TbEditorDataService tbEditorDataService;

    /**
     * 分页查询
     *
     * @param tbEditorData 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbEditorData>> queryByPage(TbEditorData tbEditorData, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbEditorDataService.queryByPage(tbEditorData, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbEditorData> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbEditorDataService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbEditorData 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbEditorData> add(TbEditorData tbEditorData) {
        return ResponseEntity.ok(this.tbEditorDataService.insert(tbEditorData));
    }

    /**
     * 编辑数据
     *
     * @param tbEditorData 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbEditorData> edit(TbEditorData tbEditorData) {
        return ResponseEntity.ok(this.tbEditorDataService.update(tbEditorData));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbEditorDataService.deleteById(id));
    }

}

