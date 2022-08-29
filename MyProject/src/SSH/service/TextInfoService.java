package service;

import java.util.List;

import entity.TextInfo;

public interface TextInfoService {

	public List<TextInfo> getTextInfo();
	
	public void writeText(TextInfo textInfo);
}
