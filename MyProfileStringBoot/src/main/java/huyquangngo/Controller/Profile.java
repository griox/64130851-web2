package huyquangngo.Controller;

import ngoquanghuy.MyProfile.Infor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Profile {
    @GetMapping("/profile")
    public String profile(Model model){
        List<Infor> profile = new ArrayList<>();
        profile.add(new Infor("MSSV","64130851"));
        profile.add(new Infor("Họ và Tên","Ngô Quang Huy"));
        profile.add(new Infor("năm sinh","2004"));
        profile.add(new Infor("giới tính","Nam"));
        model.addAttribute("MyProfile",profile);
        return "profile";
    }
}
