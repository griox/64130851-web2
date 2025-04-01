package huyquangngo.main.thigk_ntu64130851.controllers;

import huyquangngo.main.thigk_ntu64130851.models.Post;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class PostController {
    @RequestMapping("/")
    public String display(ModelMap Mssv, ModelMap hoTen, ModelMap namSinh, ModelMap gioiTinh) {
        Mssv.addAttribute("MSSV","64130851");
        hoTen.addAttribute("hoTen", "Ngô Quang Huy");
        namSinh.addAttribute("namSinh", "2004");
        gioiTinh.addAttribute("gioiTinh", "Nam");
        return "index";
    }
    @RequestMapping("/postList")
    public String postList(ModelMap model) {
            List<Post> postList = new ArrayList<>();
            postList.add(new Post("1", "Spring Boot Basics", "Introduction to Spring Boot", "101"));
            postList.add(new Post("2", "REST API with Spring", "How to build REST APIs", "102"));
            postList.add(new Post("3", "Thymeleaf in Spring", "Using Thymeleaf for templates", "103"));
            postList.add(new Post("4", "Spring Security", "Implement authentication", "104"));
            postList.add(new Post("5", "Docker & Spring Boot", "Containerizing a Spring Boot app", "105"));
            model.addAttribute("posts", postList);
            return "postList";
    }
}

