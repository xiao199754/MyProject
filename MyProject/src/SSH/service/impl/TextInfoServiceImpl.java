package service.impl;

import java.util.List;

import dao.TextInfoDao;
import entity.TextInfo;
import service.TextInfoService;

public class TextInfoServiceImpl implements TextInfoService{

	private TextInfoDao textInfoDao;
	
	@Override
	public List<TextInfo> getTextInfo() {
		return textInfoDao.getInfo();
	}
	
	public TextInfoDao getTextInfoDao() {
		return textInfoDao;
	}
	public void setTextInfoDao(TextInfoDao textInfoDao) {
		this.textInfoDao = textInfoDao;
	}

	@Override
	public void writeText(TextInfo textInfo) {
		textInfoDao.writeText(textInfo);
	}

}
