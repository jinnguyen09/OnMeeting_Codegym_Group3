package onmeet.admin.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDangNhapController {
    @GetMapping("/admin-dang-nhap")
    public String adminLogin(){
        return "auth/admin-dang-nhap";
    }
}
