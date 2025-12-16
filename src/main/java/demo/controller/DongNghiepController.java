package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DongNghiepController {
    @GetMapping("/danh-sach-dong-nghiep")
    public String dongNghiep(Model model) {
        model.addAttribute("activePage", "danh-sach-dong-nghiep");
        return "danh-sach-dong-nghiep";
    }
}
