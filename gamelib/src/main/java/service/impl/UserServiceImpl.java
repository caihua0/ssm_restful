package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.IUserDao;
import domain.User;
import service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getOne(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.getOne(userId);
	}
	public List<User> getAll(){
		return this.userDao.getAll();
	}

}
