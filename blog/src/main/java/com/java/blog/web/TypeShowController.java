package com.java.blog.web;

import com.java.blog.po.Type;
import com.java.blog.service.*;
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
public class TypeShowController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;

    @GetMapping("/types/{id}")
    public String blogType(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                           @PathVariable Long id,
                           BlogQuery blog,
                           Model model){
        List<Type> types = typeService.listType();
        if (id == -1){
            id=types.get(0).getId();
        }
        blog.setTypeId(id);
        model.addAttribute("blogPage",blogService.listBlog(pageable,blog));
        model.addAttribute("typePage",typeService.listType());
        model.addAttribute("activeTypeId",id);
        return "types";
    }

    @PostMapping("/types/search/{id}")
    public String blogTypeSearch(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                                 @PathVariable Long id,
                                 BlogQuery blog,
                                 Model model){

        model.addAttribute("blogPage",blogService.listBlog(pageable,blog));
        model.addAttribute("typePage",typeService.listType());
        model.addAttribute("activeTypeId",id);
        return "/types :: blogList";
    }
}
