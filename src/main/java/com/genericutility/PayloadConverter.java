package com.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PayloadConverter {

	
	public static String generatePayload(String filename) throws IOException
	{
		String filePath = "./src/test/resources/"+filename;
		//In the following step we are converting json into string and returning 
		return new String(Files.readAllBytes(Paths.get(filePath)));
	}
	
	public static String getEndPointData(String filename , String keyValue) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:/Users/User/Desktop/RestAssured/Cucumber_Framework_API/src/test/resources/"+filename);
		Properties properties = new Properties() ;
		properties.load(fis);
		String value = properties.getProperty(keyValue);
		return value;
	}
}
