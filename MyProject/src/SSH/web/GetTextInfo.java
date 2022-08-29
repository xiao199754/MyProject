package web;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.TextInfo;
import service.impl.TextInfoServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetTextInfo extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ApplicationContext ac=new ClassPathXmlApplicationContext("src/beans.xml");
	private TextInfoServiceImpl textInfoServiceImpl;
	private List<TextInfo> textInfos;
	private ActionContext actionContext=ActionContext.getContext();
	
	@Test
	public String getTextInfo(){
		TextInfoServiceImpl textInfoServiceImpl=(TextInfoServiceImpl) ac.getBean("textInfoServiceImpl");
		textInfos=textInfoServiceImpl.getTextInfo();
		System.out.println(textInfos.get(7).getText());
		Map<String, Object> session=actionContext.getSession();
		session.put("textInfos", "ok");
		return SUCCESS;
	}

	public TextInfoServiceImpl getTextInfoServiceImpl() {
		return textInfoServiceImpl;
	}

	public void setTextInfoServiceImpl(TextInfoServiceImpl textInfoServiceImpl) {
		this.textInfoServiceImpl = textInfoServiceImpl;
	}

	public List<TextInfo> getTextInfos() {
		return textInfos;
	}

	public void setTextInfos(List<TextInfo> textInfos) {
		this.textInfos = textInfos;
	}
}
