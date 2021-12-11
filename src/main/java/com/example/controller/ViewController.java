package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理单纯用来请求页面的HTTP请求
 */
@Controller
public class ViewController {
    /**
     * 处理请求项目主页的HTTP请求
     * @return 项目主页
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
