package onmeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LienHeController {
    @GetMapping("/lien-he")
    public String lienhe(Model model) {
        model.addAttribute("activePage", "lien-he");
        return "lien-he";
    }
}
