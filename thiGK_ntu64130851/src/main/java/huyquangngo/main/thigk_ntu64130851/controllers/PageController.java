package huyquangngo.main.thigk_ntu64130851.controllers;

import huyquangngo.main.thigk_ntu64130851.models.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
    @RequestMapping("/")
    public String display(ModelMap Mssv, ModelMap hoTen, ModelMap namSinh, ModelMap gioiTinh) {
        Mssv.addAttribute("MSSV","64130851");
        hoTen.addAttribute("hoTen", "Ngô Quang Huy");
        namSinh.addAttribute("namSinh", "2004");
        gioiTinh.addAttribute("gioiTinh", "Nam");
        return "index";
    }
    @GetMapping("/List")
    public String pageList(ModelMap m){
        List<Page> pageList = new ArrayList<>();
        pageList.add(new Page("1L", "Facebook", "social", "Trang cá nhân", "2L"));
        pageList.add(new Page("2L", "Google", "search", "Công cụ tìm kiếm", null));
        pageList.add(new Page("3L", "YouTube", "video", "Trang chia sẻ video", "2L"));
        pageList.add(new Page("4L", "Twitter", "news", "Mạng xã hội tin tức", "1L"));
        pageList.add(new Page("5L", "LinkedIn", "jobs", "Mạng lưới nghề nghiệp", null));
        pageList.add(new Page("6L", "Instagram", "photo", "Mạng xã hội hình ảnh", "1L"));
        pageList.add(new Page("7L", "Wikipedia", "knowledge", "Bách khoa toàn thư mở", null));
        pageList.add(new Page("8L", "Amazon", "shopping", "Trang thương mại điện tử", null));
        pageList.add(new Page("9L", "Reddit", "forum", "Diễn đàn thảo luận", null));
        pageList.add(new Page("10L", "Netflix", "streaming", "Dịch vụ xem phim trực tuyến", null));
        m.addAttribute("pageList",pageList);
        return "List";
    }
    // Hiển thị form thêm mới trang
    @GetMapping("/add")
    public String showAddPageForm(ModelMap model) {
        model.addAttribute("page", new Page("", "", "", "", ""));
        return "page-add";
    }

    // Xử lý thêm trang mới
    @PostMapping("/add")
    public String addPage(@ModelAttribute Page newPage) {
        pageList.add(newPage);
        return "redirect:/page/list";
    }

}
