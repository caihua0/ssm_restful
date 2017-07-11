package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import domain.User;

public interface IUserDao {
	User getOne(@Param("id") int userId);
	List<User> getAll();
}
