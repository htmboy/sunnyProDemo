package com.sunny.project;

public class SunnyTest {

	public static void main(String[] args) {
		
//		HairInterface left = new LeftHair();
//		left.draw();
//		
//		HairInterface right = new RightHair();
//		right.draw();
		
		HairFactory factory = new HairFactory();
//		HairInterface face = factory.getHair("right");
//		face.draw();
		
//		HairInterface face = factory.getHairByClass("com.sunny.project.RightHair");
//		face.draw();
		
		HairInterface face = factory.getHairByClassKey("right");
		face.draw();
	}

}
