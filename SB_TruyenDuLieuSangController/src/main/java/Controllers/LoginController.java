package Controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String display(ModelMap Mssv, ModelMap hoTen, ModelMap namSinh, ModelMap gioiTinh) {
        Mssv.addAttribute("MSSV","64130851");
        hoTen.addAttribute("hoTen", "Ngô Quang Huy");
        namSinh.addAttribute("namSinh", "2004");
        gioiTinh.addAttribute("gioiTinh", true);
        return "index";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request, ModelMap model) {
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        if (id != null && !id.isEmpty()) {
            model.addAttribute("id", id);
        }
        return "login";
    }
}

