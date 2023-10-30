package com.code;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000),PLATINUM(10000);

	private double ServiceCharge;
	
	private ServicePlan(double plan){
		this.ServiceCharge = plan;
	}

	public double getServiceCharge() {
		return ServiceCharge;
	}
	
	
}
