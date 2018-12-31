package com.sunny.project;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class HairFactory {

	public HairInterface getHair(String key) {
		if("left".equals(key))
			return new LeftHair();
		else if("right".equals(key))
			return new RightHair();
		return null;
	}
	
	public HairInterface getHairByClass(String className) {
		try {
			HairInterface hair = (HairInterface) Class.forName(className).getConstructor().newInstance();
			return hair;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public HairInterface getHairByClassKey(String key) {
		try {
			Map<String, String> map = new PropertiesReader().getProperties();
			
			HairInterface hair = (HairInterface) Class.forName(map.get(key)).getConstructor().newInstance();
			return hair;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
