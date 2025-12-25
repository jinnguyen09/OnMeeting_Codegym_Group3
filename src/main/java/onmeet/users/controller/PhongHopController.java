package onmeet.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhongHopController {
    @GetMapping("/phong-hop")
    public String phongHop(Model model) {
        model.addAttribute("activePage", "phong-hop");
        return "users/phong-hop";
    }

    @GetMapping("/chi-tiet-phong")
    public String chiTietPhong(Model model) {
        model.addAttribute("activePage", "phong-hop");
        return "users/chi-tiet-phong";
    }
}
