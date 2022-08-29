package web;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DoLogin extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user=new User();
	private UserServiceImpl userServiceImpl;
	private ApplicationContext ac=new ClassPathXmlApplicationContext("src/beans.xml");
	@Test
	public void doRegister(){
		UserServiceImpl userServiceImpl=(UserServiceImpl)ac.getBean("userServiceImpl");
		userServiceImpl.addUser(user);
	}
	
	@Test
	public String doLogin() throws SQLException{
		UserServiceImpl userServiceImpl=(UserServiceImpl)ac.getBean("userServiceImpl");
		List<User> users=userServiceImpl.getUser(user);
		String flag="error";
		for(int i=0;i<users.size();i++){
			User user1=users.get(i);
			if(user.getName().equals(user1.getName())&&user.getPassword().equals(user1.getPassword())){
				flag="success";
			}else {
				flag="error";
			}
		}
		System.out.println(flag);
		return flag;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
}
