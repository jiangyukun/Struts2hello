package com.springtest1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Example;



public class BaseHibernateDAO {
	protected List search(Class cla,Object condition){
		Session session=null;
		List list=null;
		try {
			session=HibernateSessionFactory.getSession();
			list=session.createCriteria(cla).add(Example.create(condition)).list();
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			session.close();
		}
		return list;		
	}	
}
