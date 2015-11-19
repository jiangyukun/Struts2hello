package com.springtest1.biz;

import java.util.List;

import com.hibtest1.entity.Users;
import com.springtest1.dao.UserDAO;
import com.springtest1.dao.UserDAOImpl;

public class UserBizImpl implements UserBiz {
	UserDAO userDAO=new UserDAOImpl();

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

/*	public boolean login(String username, String password) {
		return userDAO.login(username, password);
	}
//	public boolean checkLogin(String username,String password){
		return userDAO.login(username, password);
		
	} */
	public List login(Users condition){
		return userDAO.search(condition);
	}
	
	public void register(Users user){
		userDAO.register(user);
	}
}
