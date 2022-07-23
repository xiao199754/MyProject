package com.java.example.controller;

import com.java.example.entity.TbQuestionTag;
import com.java.example.service.TbQuestionTagService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 问题标签关联表(TbQuestionTag)表控制层
 *
 * @author makejava
 * @since 2022-07-21 21:06:03
 */
@RestController
@RequestMapping("/chengma")
public class TbQuestionTagController {
    /**
     * 服务对象
     */
    @Resource
    private TbQuestionTagService tbQuestionTagService;

    /**
     * 分页查询
     *
     * @param tbQuestionTag 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbQuestionTag>> queryByPage(TbQuestionTag tbQuestionTag, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbQuestionTagService.queryByPage(tbQuestionTag, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/search/{id}")
    public ResponseEntity<TbQuestionTag> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbQuestionTagService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbQuestionTag 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbQuestionTag> add(TbQuestionTag tbQuestionTag) {
        return ResponseEntity.ok(this.tbQuestionTagService.insert(tbQuestionTag));
    }

    /**
     * 编辑数据
     *
     * @param tbQuestionTag 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbQuestionTag> edit(TbQuestionTag tbQuestionTag) {
        return ResponseEntity.ok(this.tbQuestionTagService.update(tbQuestionTag));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbQuestionTagService.deleteById(id));
    }

}

