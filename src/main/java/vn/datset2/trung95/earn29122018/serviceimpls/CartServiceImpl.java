package vn.datset2.trung95.earn29122018.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.datset2.trung95.earn29122018.dao.ICartDetailRepository;
import vn.datset2.trung95.earn29122018.dao.ICartRepository;
import vn.datset2.trung95.earn29122018.services.ICartService;
@Service
public class CartServiceImpl implements ICartService{
	@Autowired
	private ICartRepository cartRepos;
	@Autowired
	private ICartDetailRepository cartDetailRepos;
}
