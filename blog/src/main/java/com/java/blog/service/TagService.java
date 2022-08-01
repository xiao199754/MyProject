package com.java.blog.service;

import com.java.blog.po.Tag;
import com.java.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

public interface TagService {

    /*保存*/
    Tag saveTag(Tag tag);

    /*保存，没有则新增*/
    List<Tag> saveNoTag(Tag tag,String ids);

    /*根据主键id查询*/
    Tag getTag(Long id);

    /*根据name查询*/
    Tag getTagByName(String name);

    /*分页查询*/
    Page<Tag> listTag(Pageable pageable);

    /*查询所有*/
    List<Tag> listTag();

    /*查询前面几条*/
    List<Tag> listTagTop(Integer size);

    /*查询ID的所有标签*/
    List<Tag> listTag(String ids);

    /*更新*/
    Tag updateTag(Long id,Tag tag);

    /*删除*/
    void deleteTag(Long id);
}
