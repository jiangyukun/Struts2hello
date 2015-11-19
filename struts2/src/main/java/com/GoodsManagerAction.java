package com;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.hibtest1.entity.Goods;
import com.opensymphony.xwork2.ActionSupport;
import com.springtest1.biz.GoodsBiz;

public class GoodsManagerAction extends ActionSupport implements RequestAware,SessionAware{
	GoodsBiz goodsBiz;
	
	public void setGoodsBiz(GoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
	}
	Map<String,Object> request;
	Map<String,Object> session;

	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	private Goods goods;

	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public String searchGoodsList(){
		List goodsList=goodsBiz.getGoodsList();
		session.put("goodsList", goodsList);
		return "goodsList";
	}
	

}
