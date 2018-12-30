package vn.datset2.trung95.earn29122018.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	@GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/blank") 
    public String admin() {
        return "blank";
    }

    @GetMapping("/404")
    public String accessDenied() {
        return "404";
    }

    @GetMapping("/login") 
    public String getLogin() {
        return "login";
    }
    @GetMapping("/register") 
    public String getRegister() {
        return "register";
    }
    @GetMapping("/charts") 
    public String getCharts() {
        return "charts";
    }
    @GetMapping("/table") 
    public String getTables() {
        return "tables";
    }
    @GetMapping("/forgot") 
    public String getFogot() {
        return "forgot-password";
    }
}
