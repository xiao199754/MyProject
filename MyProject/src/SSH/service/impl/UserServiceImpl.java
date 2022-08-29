package service.impl;

import java.util.List;
import dao.UserDao;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {


	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);

	}

	@Override
	public List<User> getUser(User user) {
		return userDao.getUser(user);

	}

	@Override
	public int delUser(User user,int userId) {
		userDao.delUser(user,userId);
		return 0;
	}

}
