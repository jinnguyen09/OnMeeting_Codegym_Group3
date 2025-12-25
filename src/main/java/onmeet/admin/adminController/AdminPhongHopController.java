package onmeet.admin.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPhongHopController {
    @GetMapping("/admin-quan-ly-phong-hop")
    public String phongHop(){
        return "admin/admin-phong-hop";
    }
}
