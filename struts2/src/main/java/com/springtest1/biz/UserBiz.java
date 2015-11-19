package com.springtest1.biz;

import java.util.List;

import com.hibtest1.entity.Users;

public interface UserBiz {
//	public boolean login(String username, String password);
//	public boolean checkLogin(String loginName,String loginPwd);
	public List login(Users condition);
	public void register(Users user);
}
