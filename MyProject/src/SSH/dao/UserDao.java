package dao;

import java.util.List;

import entity.User;

public interface UserDao {

	public List<User> getUser(User user);
	
	public void addUser(User user);
	
	public int delUser(User user,int userId);
	
	public int updateUser(User user);
}
