package com.cs.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class ReadPropertyFile {
	
	private ReadPropertyFile()
	{
	}
	
	public static Properties prop;

	public static Properties readPropertyFile() {
		FileInputStream fis;
		String fileName = System.getProperty("user.dir") + "/src/test/resources/config/config.properties";
		System.out.println(fileName);
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Unable to read config.properties !!!");
		}
		try {
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load config.properties !!!");
		}
		return prop;
	}
}
