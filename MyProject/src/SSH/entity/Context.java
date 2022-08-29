package entity;

import java.util.List;

public class Context {
	public TextInfo HTMLChange(TextInfo textInfo) {
		String source = textInfo.getText();
		String changeStr = "";
		changeStr = source.replace("&", "&amp;");
		changeStr = changeStr.replace(" ", "&nbsp;");
		changeStr = changeStr.replace("<", "&lt;");
		changeStr = changeStr.replace(">", "&gt;");
		changeStr = changeStr.replace("\r\n", "<br>");
		changeStr = changeStr.replace("[F", "<font ");
		changeStr = changeStr.replace("[", "<");
		changeStr = changeStr.replace("]", ">");
		textInfo.setText(changeStr);
		return textInfo;
	}

	public List<TextInfo> DBChange(List<TextInfo> textInfos) {
		for (int i = 0; i < textInfos.size(); i++) {
			String source = textInfos.get(i).getText();
			String changeStr = "";
			changeStr = source.replace("&amp;", "&");
			changeStr = changeStr.replace("&nbsp;", " ");
			changeStr = changeStr.replace("&lt;", "<");
			changeStr = changeStr.replace("&gt;", ">");
			changeStr = changeStr.replace("<br>", "\r\n");
			changeStr = changeStr.replace("<font ", "[F");
			changeStr = changeStr.replace("<", "[");
			changeStr = changeStr.replace(">", "]");
			textInfos.get(i).setText(changeStr);
		}
		return textInfos;
	}
}