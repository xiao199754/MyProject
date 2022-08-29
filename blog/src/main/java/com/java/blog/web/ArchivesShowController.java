package com.java.blog.web;

import com.java.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArchivesShowController {

        @Autowired
        private BlogService blogService;

        /**
         * @Description: //返回归档数据，博客总数
         * @param model
         * @return: {@link String}
         * @Author: pjx
         * @Date: 2022/8/5 1:11
         */
        @GetMapping("/archives")
        public String archives(Model model) {
            model.addAttribute("archiveMap",blogService.archiveBlog());
            model.addAttribute("blogCount",blogService.blogCount());
            return "archives";
        }

}
