package service;

import java.util.List;

import entity.User;

public interface UserService{

	public void addUser(User user);
	
	public List<User> getUser(User user);

	public int delUser(User user,int userId);

}
