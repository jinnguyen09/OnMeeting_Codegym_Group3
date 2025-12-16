package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LichHopController {
    @GetMapping("/lich-hop")
    public String lichHop(Model model) {
        model.addAttribute("activePage", "lich-hop");
        return "lich-hop";
    }
}
