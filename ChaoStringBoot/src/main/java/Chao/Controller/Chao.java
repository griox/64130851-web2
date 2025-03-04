package Chao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chao {

    //action
    //URl gọi action này
    @GetMapping("/chao")
    public String xinChao(Model model){
        model.addAttribute("tb","hell0");
        return "chao";
    }
}
