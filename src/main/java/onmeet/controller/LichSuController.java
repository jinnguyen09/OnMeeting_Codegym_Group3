package onmeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LichSuController {
    @GetMapping("/lich-su-cuoc-hop")
    public String lichSu(Model model) {
        model.addAttribute("activePage", "lich-su-cuoc-hop");
        return "lich-su-cuoc-hop";
    }
}
