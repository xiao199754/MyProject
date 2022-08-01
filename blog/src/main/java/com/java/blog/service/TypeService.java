package com.java.blog.service;

import com.java.blog.po.Tag;
import com.java.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    /*保存*/
    Type saveType(Type type);

    /*根据主键id查询*/
    Type getType(Long id);

    /*根据name查询*/
    Type getTypeByName(String name);

    /*分页查询*/
    Page<Type> listType(Pageable pageable);

    /*查询全部*/
    List<Type> listType();

    /*查询几条数据*/
    List<Type> listTypeTop(Integer size);

    /*更新*/
    Type updateType(Long id,Type type);

    /*删除*/
    void deleteType(Long id);
}
