package com.java.blog.web;

import com.java.blog.po.Tag;
import com.java.blog.po.Type;
import com.java.blog.service.BlogService;
import com.java.blog.service.TagService;
import com.java.blog.service.TypeService;
import com.java.blog.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TagShowController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TagService tagService;

    @GetMapping("/tags/{id}")
    public String blogType(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                           @PathVariable Long id,
                           Model model){
        List<Tag> tags = tagService.listTag();
        if (id == -1){
            id=tags.get(0).getId();
        }
        model.addAttribute("blogPage",blogService.listBlog(id,pageable));
        model.addAttribute("tagPage",tagService.listTag());
        model.addAttribute("activeTagId",id);
        return "tags";
    }

    @PostMapping("/tags/search/{id}")
    public String blogTypeSearch(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                                 @PathVariable Long id,
                                 Model model){

        model.addAttribute("blogPage",blogService.listBlog(id,pageable));
        model.addAttribute("tagPage",tagService.listTag());
        model.addAttribute("activeTagId",id);
        return "/tags :: blogList";
    }
}
