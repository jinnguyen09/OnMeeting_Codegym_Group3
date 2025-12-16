package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DangNhapController {
    @GetMapping("/dang-nhap")
    public String dangNhap() {
        return "auth/dang-nhap";
    }
}
