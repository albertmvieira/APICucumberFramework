package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import payloadsDatas.PlaceValidationDataBuild;
import resources.ResourcesAPI;
import utils.ReusableMethods;
import utils.SpecBuilder;

public class PlaceValidationSteps extends SpecBuilder {
	
	//Global variables
	RequestSpecification request;
	ResponseSpecification resspec;
	Response res;
	public static String place_id;
	
	PlaceValidationDataBuild data = new PlaceValidationDataBuild(); 
	
	@Given("Add place Payload with {string} {string} {string}")
	public void add_place_Payload(String name, String language, String adress) throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
						
		//include log to be better to visualize the construction of the body log().all()
		//Separating the request (header and body) in a variable to use it after
		request = given().log().all().spec(requestSpecification())
		.body(data.addPlacePayload(name, language, adress));
		
	}

	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String httpMethod) {
		
		//instancia da classe ResourcesAPI passando valueof - indica que o construtor sera chamado com o valueof que foi passado no resource
		ResourcesAPI resourceAPI = ResourcesAPI.valueOf(resource);
		
		//Using Spec Builder to create response
		resspec = new ResponseSpecBuilder()
				.expectStatusCode(200).
				expectContentType(ContentType.JSON).build();
		
		//deixando método dinamico para get e post
		//usando objeto resourceAPI para pegar a string resource da classe
		if (httpMethod.equalsIgnoreCase("POST")) {
			res = request.when().post(resourceAPI.getResource());
		}else if (httpMethod.equalsIgnoreCase("GET")) {
			res = request.when().get(resourceAPI.getResource());
		}
	}

	@Then("the Api call got success with status code {int}")
	public void the_Api_call_got_success_with_status_code(Integer int1) {
	   assertEquals(res.getStatusCode() , 200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String expectedValue) {
		JsonPath responseJson = ReusableMethods.rawToJson(res);
		assertEquals(expectedValue, responseJson.getString(key)); 
	}
	
	@Then("verify place_id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String name, String httpMethod) throws IOException {
		
		//pegando place_id do response e armazenando na variável
		place_id = ReusableMethods.getJsonPath(res, "place_id");
		
		//montando request através do requestSpecification e adicionando queryParam com place_id
		request = given().log().all().spec(requestSpecification()).queryParam("place_id", place_id);
		
		//chamando metodo que ja faz a requisição http
		user_calls_with_http_request(httpMethod, "GET");
		assertEquals(res.getStatusCode() , 200);
		
		//validando o nome no response do metodo getPlace
		String place = ReusableMethods.getJsonPath(res, "name");
		assertEquals(name, place);	
	}
	
	@Given("DeletePlace payload")
	public void deleteplace_payload() throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
	    
		//montando request através do requestSpecification
		request = given().spec(requestSpecification())
		.body(data.deletePlacePayload(place_id));
	}

}
