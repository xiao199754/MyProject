package com.java.blog.dao;

import com.java.blog.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long>, JpaSpecificationExecutor<Blog> {

    @Query("select t from Blog t where t.recommend = true ")
    List<Blog> findTop(Pageable pageable);

    @Query("select t from Blog t where t.title like ?1 or t.content like ?1")
    Page<Blog> listPageQuery(String query,Pageable pageable);

    @Transactional
    @Modifying
    @Query("update Blog b set b.views = b.views+1 where b.id=?1")
    int updateViews(Long id);

    @Modifying
    @Query("select function('date_format',b.updateTime,'%Y') as year from Blog b group by function('date_format',b.updateTime,'%Y') order by year")
    List<String> findGroupYear();

    @Modifying
    @Query("select b from Blog b where function('date_format',b.updateTime,'%Y')=?1")
    List<Blog> findGroupByYear(String year);


}
