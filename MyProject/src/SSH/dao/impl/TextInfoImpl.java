package dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.TextInfoDao;
import entity.Context;
import entity.TextInfo;

public class TextInfoImpl extends HibernateDaoSupport implements TextInfoDao{

	private Context context=new Context();

	@Override
	public List<TextInfo> getInfo() {
		DetachedCriteria dCriteria=DetachedCriteria.forClass(TextInfo.class);
		@SuppressWarnings("unchecked")
		List<TextInfo> textInfoList=(List<TextInfo>) getHibernateTemplate().findByCriteria(dCriteria);
		context.DBChange(textInfoList);
		return textInfoList;
	}

	@Override
	public void writeText(TextInfo textInfo) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		textInfo.setTime(timestamp);
		context.HTMLChange(textInfo);
		getHibernateTemplate().save(textInfo);
	}


}
