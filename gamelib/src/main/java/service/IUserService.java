package service;


import java.util.List;

import domain.User;

public interface IUserService {
	public User getOne(int userid);
	public List<User> getAll();
}
