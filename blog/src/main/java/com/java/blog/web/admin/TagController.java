package com.java.blog.web.admin;

import com.java.blog.po.Blog;
import com.java.blog.po.Tag;
import com.java.blog.service.BlogService;
import com.java.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class TagController {

    @Autowired
    private TagService tagService;
    @Autowired
    private BlogService blogService;

    @GetMapping("tags")
    public String tagList(@PageableDefault(size = 4,sort = {"id"},direction = Sort.Direction.DESC)
                                       Pageable pageable,
                           Model model){
        model.addAttribute("tagPage",tagService.listTag(pageable));
        return "admin/tags";
    }

    @PostMapping("tags/search")
    public String tagListSearch(@PageableDefault(size = 4,sort = {"id"},direction = Sort.Direction.DESC)
                                  Pageable pageable,
                          Model model){
        model.addAttribute("tagPage",tagService.listTag(pageable));
        return "admin/tags :: tagList";
    }

    @GetMapping("tags/input")
    public String input(Model model){
        model.addAttribute("tag",new Tag());
        return "admin/tags-input";
    }

    @GetMapping("tags/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("tag",tagService.getTag(id));
        return "admin/tags-input";
    }

    @PostMapping("tags")
    public String tagPost(@Valid Tag tag, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        Tag tag1 = tagService.getTagByName(tag.getName());
        if (tag1 != null){
            bindingResult.rejectValue("name","nameError","标签名称已存在,请不要重复添加");
        }
        if (bindingResult.hasErrors()){
            return "admin/tags-input";
        }
        Tag t = tagService.saveTag(tag);
        if (t==null){
            redirectAttributes.addFlashAttribute("message",t.getName()+"   添加失败");
        }else {
            redirectAttributes.addFlashAttribute("message",t.getName()+"   添加成功");
        }
        return "redirect:/admin/tags";
    }

    @PostMapping("tags/{id}")
    public String tagPost(@Valid Tag tag, BindingResult bindingResult,
                           @PathVariable Long id,
                           RedirectAttributes redirectAttributes){
        Tag tag1 = tagService.getTagByName(tag.getName());
        if (tag1 != null){
            bindingResult.rejectValue("name","nameError","标签名称已存在,请不要重复");
        }
        if (bindingResult.hasErrors()){
            return "admin/tags-input";
        }
        Tag t = tagService.updateTag(id,tag);
        if (t==null){
            redirectAttributes.addFlashAttribute("message",t.getName()+"   更新失败");
        }else {
            redirectAttributes.addFlashAttribute("message",t.getName()+"   更新成功");
        }
        return "redirect:/admin/tags";
    }

    @GetMapping("tags/{id}/delete")
    public String tagPost(@PathVariable Long id,RedirectAttributes redirectAttributes){
        String name = tagService.getTag(id).getName();
        if (tagService.getTag(id).getBlogs().size()>0){
            redirectAttributes.addFlashAttribute("message",name +"   存在该标签的博客,无法删除");
        }else {
            tagService.deleteTag(id);
            redirectAttributes.addFlashAttribute("message",name +"   删除成功");
        }
        return "redirect:/admin/tags";
    }
}
