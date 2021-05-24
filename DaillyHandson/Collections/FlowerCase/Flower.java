package com.capgemini.collectionsdemo;

public class Flower {

	private int fId;
	private String fName;
	private int pricePerKg;
	private int qty;
	
	
	public Flower() {
		super();
	}


	public Flower(int fId, String fName, int pricePerKg, int qty) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.pricePerKg = pricePerKg;
		this.qty = qty;
	}


	public int getfId() {
		return fId;
	}


	public void setfId(int fId) {
		this.fId = fId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public int getPricePerKg() {
		return pricePerKg;
	}


	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString(int i) {
		return "Flower :"+i+" [F_Id: "+this.getfId()+" Name: "+this.getfName()+" Price per kg: "+this.getPricePerKg()+" Quantity: "+this.getQty()+"]";
	}
}
