package vn.datset2.trung95.earn29122018.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.datset2.trung95.earn29122018.services.ICategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;
}
