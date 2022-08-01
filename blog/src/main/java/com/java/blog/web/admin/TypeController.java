package com.java.blog.web.admin;

import com.java.blog.po.Type;
import com.java.blog.service.TypeService;
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
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("types")
    public String typeList(@PageableDefault(size = 4,sort = {"id"},direction = Sort.Direction.DESC)
                                       Pageable pageable,
                           Model model){
        model.addAttribute("typePage",typeService.listType(pageable));

        /*json格式查看*/
        /*JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());// 注入处理Date类
        JSONArray jsonStr = JSONArray.fromObject(typeService.listType(pageable),jsonConfig);

        System.out.println(jsonStr);*/
        return "admin/types";
    }

    @PostMapping("types/search")
    public String typeListSearch(@PageableDefault(size = 4,sort = {"id"},direction = Sort.Direction.DESC)
                                   Pageable pageable,
                           Model model){
        model.addAttribute("typePage",typeService.listType(pageable));
        return "admin/types :: typeList";
    }

    @GetMapping("types/input")
    public String input(Model model){
        model.addAttribute("type",new Type());
        return "admin/types-input";
    }

    @GetMapping("types/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("type",typeService.getType(id));
        return "admin/types-input";
    }

    @PostMapping("types")
    public String typePost(@Valid Type type, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 != null){
            bindingResult.rejectValue("name","nameError","分类名称已存在,请不要重复添加");
        }
        if (bindingResult.hasErrors()){
            return "admin/types-input";
        }
        Type t = typeService.saveType(type);
        if (t==null){
            redirectAttributes.addFlashAttribute("message",t.getName()+"   添加失败");
        }else {
            redirectAttributes.addFlashAttribute("message",t.getName()+"   添加成功");
        }
        return "redirect:/admin/types";
    }

    @PostMapping("types/{id}")
    public String typePost(@Valid Type type, BindingResult bindingResult,
                           @PathVariable Long id,
                           RedirectAttributes redirectAttributes){
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 != null){
            bindingResult.rejectValue("name","nameError","分类名称已存在,请不要重复");
        }
        if (bindingResult.hasErrors()){
            return "admin/types-input";
        }
        Type t = typeService.updateType(id,type);
        if (t==null){
            redirectAttributes.addFlashAttribute("message",t.getName()+"   更新失败");
        }else {
            redirectAttributes.addFlashAttribute("message",t.getName()+"   更新成功");
        }
        return "redirect:/admin/types";
    }

    @GetMapping("types/{id}/delete")
    public String typePost(@PathVariable Long id,RedirectAttributes redirectAttributes){
        String name = typeService.getType(id).getName();
        if (typeService.getType(id).getBlogs().size()>0){
            redirectAttributes.addFlashAttribute("message",name +"   存在该类型的博客,无法删除");
        }else {
            typeService.deleteType(id);
            redirectAttributes.addFlashAttribute("message",name +"   删除成功");
        }
        return "redirect:/admin/types";
    }
}
