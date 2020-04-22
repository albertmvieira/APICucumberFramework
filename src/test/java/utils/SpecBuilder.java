package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpecBuilder {
	
	//Global variables
	public static RequestSpecification req;
	
	public RequestSpecification requestSpecification() throws IOException {
		
		if (req==null) {
			PrintStream log = new PrintStream(new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\java\\log\\logRequest.txt"));
			
			//Using Spec Builder to create request
			//Using addFilter to log request e response to a new file PrintStream
			req = new RequestSpecBuilder()
					.setBaseUri(ReusableMethods.getData("HOST_MapsRahulShetty"))
					.addQueryParam("key", ReusableMethods.getData("Key_MapsRahulShetty"))
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType(ContentType.JSON).build();
			
			return req;	
		}
		
		return req;
	}
	

}
