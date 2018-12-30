package vn.datset2.trung95.earn29122018.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import vn.datset2.trung95.earn29122018.services.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService productService;
}
