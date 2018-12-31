package com.sunny.project2;

public class NYFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new NYBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new NYGirl();
	}

}
