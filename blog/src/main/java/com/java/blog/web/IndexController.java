package com.java.blog.web;

import com.java.blog.po.User;
import com.java.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/*
* 前台首页控制
* */
@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private TagService tagService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                        Model model) {
        model.addAttribute("blogPage",blogService.listBlog(pageable));
        model.addAttribute("typePage",typeService.listTypeTop(6));
        model.addAttribute("tagPage",tagService.listTagTop(10));
        model.addAttribute("recommendPage",blogService.listBlogRecommendTop(8));
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/footer/fragments")
    public String fragments(Model model) {
        model.addAttribute("newBlog",blogService.listBlogRecommendTop(3));
        return "_fragments :: newBlogList";
    }

    @PostMapping("/index/search")
    public String indexPage(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                        Model model) {
        model.addAttribute("blogPage",blogService.listBlog(pageable));
        return "index :: blogList";
    }

    @PostMapping("/search")
    public String indexPageSearch(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC)
                                              Pageable pageable,
                                  @RequestParam String query,
                                  Model model) {
        model.addAttribute("blogPage",blogService.listBlog("%"+query+"%",pageable));
        model.addAttribute("query",query);
        return "search";
    }

    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id, Model model){
        model.addAttribute("blogPage",blogService.getAndConvert(id));
        model.addAttribute("comments",commentService.listCommentByBlogId(id));
        return "blog";
    }

    @PostMapping("/loginFront")
    public String loginFront(@RequestParam String username,
                             @RequestParam String password,
                             HttpSession session,
                             RedirectAttributes redirectAttributes){
        User user = userService.checkUser(username,password);

        if(user!=null){
            user.setPassword(null);
            session.setAttribute("user",user);
            return "redirect:/";
        }else {
            redirectAttributes.addFlashAttribute("message","用户名或密码错误!");
            return "redirect:/";
        }
    }

    @GetMapping("/logout")
    public String loginOut(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/";
    }
}
