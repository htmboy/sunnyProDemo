package com.sunny.project2;

public class SunnyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drawWomen();
	}

}
