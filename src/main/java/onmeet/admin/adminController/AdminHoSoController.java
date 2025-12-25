package onmeet.admin.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminHoSoController {
    @GetMapping("/admin-profile")
    public String adminHoSo(){
        return "admin/admin-ho-so";
    }
}
