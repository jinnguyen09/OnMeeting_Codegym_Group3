package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HoSoController {
    @GetMapping("/ho-so")
    public String hoSo(Model model) {
        model.addAttribute("activePage", "ho-so");
        return "ho-so";
    }
}
