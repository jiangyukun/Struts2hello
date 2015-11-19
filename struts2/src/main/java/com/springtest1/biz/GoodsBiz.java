package com.springtest1.biz;

import java.io.Serializable;
import java.util.List;

import com.hibtest1.entity.Goods;

public interface GoodsBiz {
	public List getGoodsList(Goods condition);
	public Serializable add(Goods condition);
}
