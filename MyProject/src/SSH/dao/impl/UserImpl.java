package dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.UserDao;
import entity.User;

public class UserImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public List<User> getUser(User user) {
		List<User> userList=getHibernateTemplate().findByExample(user);
		return userList;
	}

	@Override
	public void addUser(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public int delUser(User user,int userId) {
		getHibernateTemplate().delete(user.getId());


		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
