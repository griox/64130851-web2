package huyquangngo.main.thigk_ntu64130851.controllers;

import huyquangngo.main.thigk_ntu64130851.models.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
    List<Page> pageList = new ArrayList<>();
    public PageController(){
        pageList.add(new Page("1L", "Facebook", "social", "Trang cá nhân", "2L"));
        pageList.add(new Page("2L", "Google", "search", "Công cụ tìm kiếm", "1L"));
        pageList.add(new Page("3L", "YouTube", "video", "Trang chia sẻ video", "2L"));
        pageList.add(new Page("4L", "Twitter", "news", "Mạng xã hội tin tức", "1L"));
        pageList.add(new Page("5L", "LinkedIn", "jobs", "Mạng lưới nghề nghiệp", "2L"));
        pageList.add(new Page("6L", "Instagram", "photo", "Mạng xã hội hình ảnh", "1L"));
        pageList.add(new Page("7L", "Wikipedia", "knowledge", "Bách khoa toàn thư mở", "3L"));
        pageList.add(new Page("8L", "Amazon", "shopping", "Trang thương mại điện tử", "4L"));
        pageList.add(new Page("9L", "Reddit", "forum", "Diễn đàn thảo luận", "5L"));
        pageList.add(new Page("10L", "Netflix", "streaming", "Dịch vụ xem phim trực tuyến", "3L"));

    }
    @RequestMapping("/")
    public String display(ModelMap Mssv, ModelMap hoTen, ModelMap namSinh, ModelMap gioiTinh) {
        Mssv.addAttribute("MSSV","64130851");
        hoTen.addAttribute("hoTen", "Ngô Quang Huy");
        namSinh.addAttribute("namSinh", "2004");
        gioiTinh.addAttribute("gioiTinh", "Nam");
        return "/Page/index";
    }

    @GetMapping("/List")
    public String pageList(ModelMap m){
        m.addAttribute("pageList",pageList);
        return "/Page/List";
    }
    // Hiển thị form thêm mới trang
    @GetMapping("/page-add")
    public String showAddPageForm(ModelMap model) {
        model.addAttribute("page", new Page("", "", "", "", ""));
        return "/Page/page-add";
    }

    // Xử lý thêm trang mới
    @PostMapping("/addPage")
    public String addPage(@ModelAttribute Page newPage, ModelMap model) {
        pageList.add(newPage);
        model.addAttribute("pageList", pageList);
        return "/Page/List";
    }
    @GetMapping("/page/view/{id}")
    public String viewPage(@PathVariable String id, ModelMap m){
        Page found = pageList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        m.addAttribute("page", found);
        return "/Page/page-view";
    }
    @GetMapping("/page/edit/{id}")
    public String editPage(@PathVariable String id, ModelMap m){
        Page found = pageList.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
        m.addAttribute("page",found);
        return "/Page/page-edit";
    }
    @PostMapping("/page/update")
    public String updatePage(@ModelAttribute Page updatedPage, ModelMap m) {
        for (int i = 0; i < pageList.size(); i++) {
            if (pageList.get(i).getId().equals(updatedPage.getId())) {
                pageList.set(i, updatedPage);
                break;
            }
        }
        m.addAttribute("pageList", pageList);
        return "/Page/List";
    }
    @GetMapping("/page/delete/{id}")
    public String deletePage(@PathVariable String id, ModelMap m) {
        pageList.removeIf(p -> p.getId().equals(id));
        m.addAttribute("pageList", pageList);
        return "/Page/List";
    }
}
