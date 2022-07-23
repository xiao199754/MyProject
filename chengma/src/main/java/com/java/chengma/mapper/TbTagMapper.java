package com.java.chengma.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.jeffreyning.mybatisplus.base.MppBaseMapper;
import com.java.chengma.entity.TbQuestionTag;
import com.java.chengma.entity.TbTag;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbTagMapper extends MppBaseMapper<TbTag> {


    @Select("select * from tb_tag where FIND_IN_SET(id,#{id})")
    List<TbTag> queryList(TbTag tbTag);
}
