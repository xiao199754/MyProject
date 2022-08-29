package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import service.impl.UserServiceImpl;

import java.util.Iterator;
import java.util.List;

public class dome1{

	private User user=new User();
	
	@Test
	public void user(){
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userServiceImpl=(UserServiceImpl)ac.getBean("userServiceImpl");
		user.setName("Jack1");
		user.setPassword("111");
		userServiceImpl.addUser(user);
	}
	
	@Test
	public void userAdd(){
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory sessionFactory=(SessionFactory) ac.getBean("SessionFactory");
		Session session=sessionFactory.openSession();
		
		/*Configuration configuration=new Configuration().configure();
		Session session=configuration.buildSessionFactory().openSession();*/
		Transaction transaction=session.beginTransaction();
		
		User user=new User();
		user.setName("Jack7");
		user.setPassword("123456");
		
		session.save(user);
		
		transaction.commit();
	}

	@Test
	public void userFind(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userServiceImpl=(UserServiceImpl) ac.getBean("userServiceImpl");
		List<User> userList = userServiceImpl.getUser(user);
		Iterator<User> iterator = userList.iterator();
		while(iterator.hasNext()){
			User user2 = iterator.next();
			System.out.println(user2);
		}
		for (User user1: userList) {
			System.out.println(user1);
		}
	}

	public void userDel(){
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory sessionFactory=(SessionFactory) ac.getBean("SessionFactory");
		Session session=sessionFactory.openSession();

		/*Configuration configuration=new Configuration().configure();
		Session session=configuration.buildSessionFactory().openSession();*/
		Transaction transaction=session.beginTransaction();

		UserServiceImpl userServiceImpl=(UserServiceImpl) ac.getBean("userServiceImpl");
		List<User> userList = userServiceImpl.getUser(user);
		if(1 == userList.get(0).getId()){
			userServiceImpl.delUser(user,1);
			System.out.println("删除成功");
		}
		System.out.println("无对象");

		transaction.commit();
	}

}
