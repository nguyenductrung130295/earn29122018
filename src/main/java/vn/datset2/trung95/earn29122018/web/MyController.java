package vn.datset2.trung95.earn29122018.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mycontroller")
public class MyController {

	@RequestMapping("/home")
	String home() {
		System.out.println("into home");
		return "home";
	}
}
