package huyquangngo.main.thigk_ntu64130851.controllers;

import huyquangngo.main.thigk_ntu64130851.models.Page;
import huyquangngo.main.thigk_ntu64130851.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Controller
public class PostController {
    List<Post> postList = new ArrayList<>();
    public PostController(){
        postList.add(new Post("1", "Spring Boot Basics", "Introduction to Spring Boot", "101"));
        postList.add(new Post("2", "REST API with Spring", "How to build REST APIs", "102"));
        postList.add(new Post("3", "Thymeleaf in Spring", "Using Thymeleaf for templates", "103"));
        postList.add(new Post("4", "Spring Security", "Implement authentication", "104"));
        postList.add(new Post("5", "Docker & Spring Boot", "Containerizing a Spring Boot app", "105"));
    }
    @RequestMapping("/postList")
    public String postList(ModelMap model) {
            model.addAttribute("postList", postList);
            return "/Post/postList";
    }
    @GetMapping("/post-add")
    public String showAddPostForm(ModelMap model) {
        model.addAttribute("post", new Post("", "", "", ""));
        return "/Post/post-add";
    }

    // Xử lý thêm trang mới
    @PostMapping("/addPost")
    public String addPost(@ModelAttribute Post newPost, ModelMap model) {
        postList.add(newPost);
        model.addAttribute("postList", postList);
        return "/Post/postList";
    }
    @GetMapping("/post/view/{id}")
    public String viewPage(@PathVariable String id, ModelMap m){
        Post found = postList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        m.addAttribute("post", found);
        return "/Post/post-view";
    }
    @GetMapping("/post/edit/{id}")
    public String editPage(@PathVariable String id, ModelMap m){
        Post found = postList.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
        m.addAttribute("page",found);
        return "/Post/post-edit";
    }
    @PostMapping("/post/update")
    public String updatePage(@ModelAttribute Post updatedPost, ModelMap m) {
        for (int i = 0; i < postList.size(); i++) {
            if (postList.get(i).getId().equals(updatedPost.getId())) {
                postList.set(i, updatedPost);
                break;
            }
        }
        m.addAttribute("postList", postList);
        return "/Post/postList";
    }
    @GetMapping("/post/delete/{id}")
    public String deletePage(@PathVariable String id, ModelMap m) {
        postList.removeIf(p -> p.getId().equals(id));
        m.addAttribute("postList", postList);
        return "/Post/postList";
    }
}

