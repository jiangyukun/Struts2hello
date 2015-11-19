package com.hibtest1.entity;

import java.util.Date;

public class Goods implements java.io.Serializable {
	private Integer goodsId;
	private String goodsName;
	private String goodsBackName;
	private float value;
	private float price;
	private float length;
	private float wide;
	private float tall;
	private float mweight;
	private float volume;
	private float vweight;
	private String standard;
	private String unit;
	private String service;
	private Date creationDate;
	private Integer baozhiqi;
	private Date expirationDate;

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsBackName() {
		return goodsBackName;
	}

	public void setGoodsBackName(String goodsBackName) {
		this.goodsBackName = goodsBackName;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWide() {
		return wide;
	}

	public void setWide(float wide) {
		this.wide = wide;
	}

	public float getTall() {
		return tall;
	}

	public void setTall(float tall) {
		this.tall = tall;
	}

	public float getMweight() {
		return mweight;
	}

	public void setMweight(float mweight) {
		this.mweight = mweight;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float getVweight() {
		return vweight;
	}

	public void setVweight(float vweight) {
		this.vweight = vweight;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getBaozhiqi() {
		return baozhiqi;
	}

	public void setBaozhiqi(Integer baozhiqi) {
		this.baozhiqi = baozhiqi;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
