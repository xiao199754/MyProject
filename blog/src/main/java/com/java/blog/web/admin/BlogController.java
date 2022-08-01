package com.java.blog.web.admin;

import com.java.blog.po.Blog;
import com.java.blog.po.Tag;
import com.java.blog.po.User;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/*
* 后台blogs访问控制
* */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private TagService tagService;

    @GetMapping("/blogs")
    public String blogPage(@PageableDefault(size = 4,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                            BlogQuery blog,
                            Model model){
        model.addAttribute("typePage",typeService.listType());
        model.addAttribute("blogPage",blogService.listBlog(pageable,blog));
        return "admin/blogs";
    }

    @PostMapping("/blogs/search")
    public String blogSearch(@PageableDefault(size = 4,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                            BlogQuery blog,
                            Model model){
        model.addAttribute("blogPage",blogService.listBlog(pageable,blog));
        /*局部刷新blogList块*/
        return "admin/blogs :: blogList";
    }

    private void setTypesAndTags(Model model){
        model.addAttribute("typePage",typeService.listType());
        model.addAttribute("tagPage",tagService.listTag());
    }

    @GetMapping("/blogs/input")
    public String blogInput(Model model){
        setTypesAndTags(model);
        model.addAttribute("blog",new Blog());
        return "admin/blogs-input";
    }

    @GetMapping("/blogs/{id}/input")
    public String blogEditInput(@PathVariable Long id, Model model){
        setTypesAndTags(model);
        Blog blog = blogService.getBlog(id);
        blog.init();
        model.addAttribute("blog",blog);
        return "admin/blogs-input";
    }

    @PostMapping("/blogs")
    public String blogPost(Blog blog, RedirectAttributes redirectAttributes, HttpSession session){
        blog.setUser((User) session.getAttribute("user"));

        tagService.saveNoTag(new Tag(),blog.getTagIds());

        blog.setType(typeService.getType(blog.getType().getId()));
        blog.setTags(tagService.listTag(blog.getTagIds()));


        Blog blog1 = blogService.saveBlog(blog);
        if (blog1==null){
            redirectAttributes.addFlashAttribute("message","标题: "+blog1.getTitle()+"   操作失败");
        }else {
            redirectAttributes.addFlashAttribute("message","标题: "+blog1.getTitle()+"   操作成功");
        }
        return "redirect:/admin/blogs";
    }

    @GetMapping("/blogs/{id}/delete")
    public String deleteBlog(@PathVariable Long id,RedirectAttributes redirectAttributes){

        String title = blogService.getBlog(id).getTitle();
        blogService.deleteBlog(id);
        redirectAttributes.addFlashAttribute("message",title +"   删除成功");
        return "redirect:/admin/blogs";
    }
}
