package vn.datset2.trung95.earn29122018.serviceimpls;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.datset2.trung95.earn29122018.dao.IUserRepository;
import vn.datset2.trung95.earn29122018.services.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserRepository userRepos;
	
	
}
