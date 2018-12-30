package vn.datset2.trung95.earn29122018.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.datset2.trung95.earn29122018.services.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	@GetMapping("/init")
    public String init() {
		return "redirect:/about";
    }
}
