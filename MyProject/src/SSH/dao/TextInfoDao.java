package dao;

import java.util.List;

import entity.TextInfo;

public interface TextInfoDao {

	public List<TextInfo> getInfo();
	
	public void writeText(TextInfo textInfo);
}
