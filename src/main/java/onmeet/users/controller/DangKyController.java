package onmeet.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DangKyController {
    @GetMapping("/dang-ky")
    public String dangKy() {
        return "/auth/dang-ky";
    }
}
