package com.src.modules;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();

	public static void readProperties() {

		try {
			InputStream inputStream = new FileInputStream(
					"C:\\Users\\vikram sagar\\eclipse-workspace\\moduleTest4\\config.properties");
			prop.load(inputStream);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
