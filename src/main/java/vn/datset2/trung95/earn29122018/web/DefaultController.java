package vn.datset2.trung95.earn29122018.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	@GetMapping("/about")
    public String index() {
        return "about";
    }

    @GetMapping("/admin") 
    public String admin() {
        return "home";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "error";
    }

    @GetMapping("/login") 
    public String getLogin() {
        return "login";
    }
    
}
