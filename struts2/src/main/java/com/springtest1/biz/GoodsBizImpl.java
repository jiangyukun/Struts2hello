package com.springtest1.biz;

import java.util.List;

import com.hibtest1.entity.Goods;
import com.springtest1.dao.GoodsDAO;

public class GoodsBizImpl implements GoodsBiz{
	private GoodsDAO goodsDAO;
	public void setGoodsDAO(GoodsDAO goodsDAO){
		this.goodsDAO=goodsDAO;
	}
	public List getGoodsList(){
		Goods goods=new Goods();
		List list=goodsDAO.search(goods);
		return list;
	}

}
