package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.TextInfoService;

public class demo2 {

	@Test
	public void getInfo(){
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		TextInfoService textInfoService=(TextInfoService)ac.getBean("textInfoServiceImpl");
		textInfoService.getTextInfo();
	}
}
