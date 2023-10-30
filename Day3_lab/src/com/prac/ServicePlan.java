package com.prac;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double planAmount;
	ServicePlan(double plan){
		this.planAmount = plan;
	}
	
//	setter 
	public double getPlanAmount(){
		return this.planAmount;
	}
	
//	setter
	public void setPlanAmount(double amount) {
		this.planAmount = amount;
	}
}
