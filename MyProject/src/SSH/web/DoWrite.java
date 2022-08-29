package web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.TextInfo;
import service.impl.TextInfoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DoWrite extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TextInfo textInfo=new TextInfo();
	private TextInfoServiceImpl textInfoServiceImpl;
	private ApplicationContext ac=new ClassPathXmlApplicationContext("src/beans.xml");

	public String doWrite(){
		textInfoServiceImpl=(TextInfoServiceImpl) ac.getBean("textInfoServiceImpl");
		textInfoServiceImpl.writeText(textInfo);
		return SUCCESS;
	}

	public TextInfo getTextInfo() {
		return textInfo;
	}

	public void setTextInfo(TextInfo textInfo) {
		this.textInfo = textInfo;
	}

	public TextInfoServiceImpl getTextInfoServiceImpl() {
		return textInfoServiceImpl;
	}

	public void setTextInfoServiceImpl(TextInfoServiceImpl textInfoServiceImpl) {
		this.textInfoServiceImpl = textInfoServiceImpl;
	}
}
