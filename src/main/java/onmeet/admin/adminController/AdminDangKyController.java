package onmeet.admin.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDangKyController {
    @GetMapping("/admin-dang-ky")
    public String adminDangKy(){
        return "auth/admin-dang-ky";
    }
}
