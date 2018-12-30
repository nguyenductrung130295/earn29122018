package vn.datset2.trung95.earn29122018.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.datset2.trung95.earn29122018.dao.IProductRepository;
import vn.datset2.trung95.earn29122018.services.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private IProductRepository productRepos;
}
