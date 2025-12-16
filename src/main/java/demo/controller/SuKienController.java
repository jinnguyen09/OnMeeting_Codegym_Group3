package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuKienController {
    @GetMapping("/su-kien")
    public String sukien(Model model) {
        model.addAttribute("activePage", "su-kien");
        return "su-kien";
    }
}
