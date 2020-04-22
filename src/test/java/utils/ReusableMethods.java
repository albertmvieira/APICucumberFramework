package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public static String issueID = null; 
	final static Logger log = Logger.getLogger(ReusableMethods.class);
	
	public static XmlPath rawToXML(Response response) {
		//Convert response to string
		String responseString = response.asString();
		log.info(responseString);
		
		//Convert string to XML
		XmlPath responseXml = new XmlPath(responseString);
		return responseXml;
	}
	
	public static JsonPath rawToJson(Response response) {
		//Convert response to string
		String responseString = response.asString();
		log.info("String response: " + responseString);
		
		//Convert string to JSON
		JsonPath responseJson = new JsonPath(responseString);
		return responseJson;
	}
	
	//retorna um valor especifico do response
	public static String getJsonPath(Response response, String key) {
		//Convert response to string
		String responseString = response.asString();
		log.info("String response: " + responseString);
		
		//Convert string to JSON
		JsonPath responseJson = new JsonPath(responseString);
		return responseJson.getString(key);
	}
	
	public static String getData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\env.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

}
