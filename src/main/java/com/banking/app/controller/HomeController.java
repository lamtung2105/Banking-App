package com.banking.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Home Controller - Controller đầu tiên để test ứng dụng
 * 
 * @Controller: Đánh dấu đây là Spring MVC Controller
 */
@Controller
public class HomeController {
    
    /**
     * Endpoint đơn giản trả về JSON để test REST API
     * 
     * @ResponseBody: Trả về dữ liệu trực tiếp thay vì view name
     */
    @GetMapping("/api/test")
    @ResponseBody
    public String apiTest() {
        return "{ \"message\": \"Banking App API is working!\", \"status\": \"success\" }";
    }
    
    /**
     * Endpoint trả về Thymeleaf view để test template engine
     * 
     * Model: Object chứa dữ liệu truyền từ Controller sang View
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "Banking Application");
        model.addAttribute("message", "Chào mừng đến với hệ thống ngân hàng!");
        return "home"; // Tìm file templates/home.html
    }
}
