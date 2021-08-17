package com.syntax.class12;

public class Phone {
	
	int price;
	double screenDiagonal;
	String OS;
	String model;
	
	void fiveG() {
		System.out.println(model + " have 5G");
	}
	void expensive() {
		System.out.println(model + " is expensive");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone iPhone = new Phone();
		
		iPhone.model = "iPhone 12 Pro Max";
		iPhone.OS = "iOS";
		iPhone.screenDiagonal = 6.68;
		iPhone.price = 1099;
		iPhone.fiveG();
		iPhone.expensive();
		
		Phone Android = new Phone();
		
		Android.model = "Xiaomi Redmi 9";
		Android.OS = "Android";
		Android.price = 139;
		Android.screenDiagonal = 6.53;
		Android.fiveG();
		
		Phone Nokia = new Phone();
		
		Nokia.model = "Nokia 8.3 5G";
		Nokia.OS = "Android";
		Nokia.price = 399;
		Nokia.screenDiagonal = 6.81;
		Nokia.fiveG();
		
		
		

	}

}
