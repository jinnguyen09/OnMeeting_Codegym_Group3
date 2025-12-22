package onmeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("activePage", "home");
        return "home";
    }

    @GetMapping("/dieu-khoan")
    public String dieuKhoan(Model model) {
        model.addAttribute("activePage", "dieu-khoan");
        return "dieu-khoan";
    }

    @GetMapping("/quyen-rieng-tu")
    public String quyenRiengTu(Model model) {
        model.addAttribute("activePage", "quyen-rieng-tu");
        return "quyen-rieng-tu";
    }
}
