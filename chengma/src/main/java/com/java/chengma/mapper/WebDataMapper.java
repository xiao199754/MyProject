package com.java.chengma.mapper;

import com.java.chengma.entity.TbEditorData;
import com.java.chengma.entity.TbQuestion;
import com.java.chengma.entity.TbTag;
import com.java.chengma.entity.TbUserVisitedQuestion;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WebDataMapper {

    /*主体数据*/
    @Select("select * from tb_question where id = #{id}")
    List<TbQuestion> queryListTbQuestion(TbQuestion tbQuestion);

    /*标签*/
    @Select("select a.* from tb_tag as a,tb_question as b where FIND_IN_SET(a.id,b.tags) and b.id= #{id} ")
    List<TbTag> queryListTbTag(TbTag tbTag);

    /*浏览次数*/
    @Select("select count(*) from tb_user_visited_question as a,tb_question as b where b.id= #{id} and a.question_id=b.id ")
    Long queryListCount(TbUserVisitedQuestion tbUserVisitedQuestion);

    /*页面渲染*/
    @Select("select a.* from tb_editor_data as a,tb_question as b where b.id= #{id} and a.id=b.question")
    List<TbEditorData> queryListTbEditorData(TbEditorData tbEditorData);

    /*评论*/
    @Select("select a.* from tb_editor_data as a,tb_question as b,tb_comment as c " +
            "where b.id= #{id} and b.id=c.question_id and a.id=c.`comment`")
    List<TbEditorData> queryListTbEditorDataAndComment(TbEditorData tbEditorData);
}
