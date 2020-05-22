package com.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 9:53
 * @Description:
 */
@Controller
public class DispatcherController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/welcome.html")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/picture-list.html")
    public String pictureList() {
        return "picture-list";
    }

    @RequestMapping("/admin-list.html")
    public String adminList() {
        return "admin-list";
    }

    @RequestMapping("/about.html")
    public String about() {
        return "about";
    }

}
