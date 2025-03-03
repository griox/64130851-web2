package huyquangngo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public ModelAndView getPage(){
        ModelAndView m = new ModelAndView();
        m.setViewName("welcome");
        return m;
    }
}
