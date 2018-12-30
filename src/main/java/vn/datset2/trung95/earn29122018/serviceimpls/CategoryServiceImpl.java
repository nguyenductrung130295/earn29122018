package vn.datset2.trung95.earn29122018.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.datset2.trung95.earn29122018.dao.ICategoryRepository;
import vn.datset2.trung95.earn29122018.services.ICategoryService;
@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	private ICategoryRepository categoryRepos;
}
