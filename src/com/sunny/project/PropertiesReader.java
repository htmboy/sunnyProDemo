package com.sunny.project;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {
	
	public Map<String, String> getProperties(){
		Map<String, String> map = new HashMap<String, String>();
		try {
			
			Properties props = new Properties();
			InputStream in = getClass().getResourceAsStream("type.properties");
			props.load(in);
			Enumeration en = props.propertyNames();
			while(en.hasMoreElements()) {
				String key = (String) en.nextElement();
				String property = props.getProperty(key);
				map.put(key, property);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
