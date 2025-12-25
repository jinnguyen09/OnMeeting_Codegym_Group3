package onmeet.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("activePage", "home");
        return "users/trang-chu";
    }

    @GetMapping("/dieu-khoan")
    public String dieuKhoan(Model model) {
        model.addAttribute("activePage", "dieu-khoan");
        return "users/dieu-khoan";
    }

    @GetMapping("/quyen-rieng-tu")
    public String quyenRiengTu(Model model) {
        model.addAttribute("activePage", "quyen-rieng-tu");
        return "users/quyen-rieng-tu";
    }
}
