package huyquangngo.Controller;
import jakarta.servlet.http.HttpServletRequest;
import huyquangngo.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @RequestMapping("/")
    public String display(ModelMap Mssv, ModelMap hoTen, ModelMap namSinh, ModelMap gioiTinh) {
        Mssv.addAttribute("MSSV","64130851");
        hoTen.addAttribute("hoTen", "Ngô Quang Huy");
        namSinh.addAttribute("namSinh", "2004");
        gioiTinh.addAttribute("gioiTinh", "Nam");
        return "index";
    }
    @RequestMapping("/truyenDoiTuong")
    public String truyenObject(ModelMap model) {
        Student student = new Student("64130851", "Ngô QUANG HUY", true, 2004);
        model.addAttribute("student", student);
        return "object";
    }
    @RequestMapping("/list")
    public String studentList(ModelMap model){
        List<Student> students = new ArrayList<>();
        students.add(new Student("64130051","Nguyen Van A",true,2004));
        students.add(new Student("64130052","Nguyen Van B",true,2004));
        students.add(new Student("64130053","Nguyen Van C",false,2004));
        students.add(new Student("64130054","Nguyen Van D",true,2004));
        students.add(new Student("64130055","Nguyen Van E",false,2004));
        students.add(new Student("64130851","Ngo Quang Huy",true,2004));
        return "list";
    }
    public String login(HttpServletRequest request, ModelMap model){
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        if(id != null && !id.isEmpty()){
            model.addAttribute("id",id);
        }
        return "user";
    }
}
