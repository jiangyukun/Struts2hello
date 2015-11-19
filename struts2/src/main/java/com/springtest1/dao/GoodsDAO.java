package com.springtest1.dao;

import java.io.Serializable;
import java.util.List;

import com.hibtest1.entity.Goods;

public interface GoodsDAO {
	public List search(Goods condition);
	public Serializable add(Goods condition);

}
