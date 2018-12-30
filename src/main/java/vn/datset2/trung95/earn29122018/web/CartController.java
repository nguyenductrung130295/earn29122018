package vn.datset2.trung95.earn29122018.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import vn.datset2.trung95.earn29122018.services.ICartService;

@Controller
public class CartController {
	@Autowired
	private ICartService cartService;
}
