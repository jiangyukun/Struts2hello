package com.springtest1.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibtest1.entity.Goods;

public class GoodsDAOImpl extends HibernateDaoSupport implements GoodsDAO{
	public List search(final Goods condition) {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria c = session.createCriteria(Goods.class);
						if (condition != null) {
							if (condition.getGoodsName() != null
									&& !condition.getGoodsName().equals("")) {
								c.add(Restrictions.eq("goodsName",
										condition.getGoodsName()));
							}
							
						}
						return c.list();
					}
				});
	}
	
	public Serializable add(final Goods condition) {
		return super.getHibernateTemplate().execute(
				new HibernateCallback<Serializable>() {
					public Serializable doInHibernate(Session session)
							throws HibernateException, SQLException {
						Transaction trans = session.beginTransaction();
						Serializable id = null;
						try {
							Goods good = new Goods();
							good.setGoodsName(condition.getGoodsName());
							good.setBaozhiqi(condition.getBaozhiqi());
							good.setCreationDate(condition.getCreationDate());
							good.setExpirationDate(condition.getExpirationDate());
							good.setGoodsBackName(condition.getGoodsBackName());
							good.setLength(condition.getLength());
							good.setMweight(condition.getMweight());
							good.setPrice(condition.getPrice());
							good.setService(condition.getService());
							good.setStandard(condition.getStandard());
							good.setTall(condition.getTall());
							good.setUnit(condition.getUnit());
							good.setValue(condition.getValue());
							good.setVolume(condition.getVolume());
							good.setVweight(condition.getVweight());
							good.setWide(condition.getWide());	
							id = session.save(good);
							trans.commit();
						} catch (Exception ex) {
							ex.printStackTrace();
							trans.rollback();
						} finally {
							session.close();
						}
						return id;
					}
				});
	}	 

}
