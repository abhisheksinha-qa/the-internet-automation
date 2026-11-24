package com.theinternet.utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader{
	
	private ConfigReader() {}
	
	public static final Properties PROPS = new Properties();
	
	static {
		
		Path file = Paths.get(System.getProperty("user.dir")).resolve("src/test/resources/config/config.properties");
		
		
		
		
	}
	
	
	
	
}

