package com.app.amazon;

import java.util.Map;

public class Products {

	// POJO Classes
	private long serialNo;
	private Map productName;
	private int count;
	private boolean isAvailable;

	public Products(long serialNo, Map productName, int count, boolean isAvailable) {
		super();
		this.serialNo = serialNo;
		this.productName = productName;
		this.count = count;
		this.isAvailable = isAvailable;
	}

	public long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}

	public Map getProductName() {
		return productName;
	}

	public void setProductName(Map productName) {
		this.productName = productName;
	}

	public int getCount() {
		count = productName.size();
		return count;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
