    package huyquangngo.main.giuaki.Controllers;

    import huyquangngo.main.giuaki.Models.Student;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.ModelMap;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;

    import java.util.ArrayList;
    import java.util.List;
    @Controller
    public class StudentController {
        @GetMapping("/about")
        public String display(ModelMap model) {
            model.addAttribute("MSSV", "64130851");
            model.addAttribute("hoTen", "Ngô Quang Huy");
            model.addAttribute("diemTB", 10.0);
            model.addAttribute("gioiTinh", true);
            return "about"; // Trả về template about.html
        }
        @GetMapping("/list")
        public String studentList(ModelMap m){
            List<Student> list = new ArrayList<>();
            list.add(new Student("64130852","Ngo Bao Ngoc",false, 7.5F));
            list.add(new Student("64130853","Nguyen Van A",false, 5.5F));
            list.add(new Student("64130854","Vo Thi Thanh Thao",false, 8.5F));
            list.add(new Student("64130856","Tran Van Luc",true, 9.5F));
            list.add(new Student("64130857","Hoang Van Anh",false, 2.5F));
            list.add(new Student("64130858","Truong Anh Tu",true, 4.5F));
            m.addAttribute("myList",list);
            return "list";
        }

    }
