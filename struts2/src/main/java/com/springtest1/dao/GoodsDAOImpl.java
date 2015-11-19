package com.springtest1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
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

}
