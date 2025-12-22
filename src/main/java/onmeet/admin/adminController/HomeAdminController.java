package onmeet.admin.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAdminController {
    @GetMapping("/admin-home")
    public String homeAdmin(){
        return "admin/admin-home";
    }
}
