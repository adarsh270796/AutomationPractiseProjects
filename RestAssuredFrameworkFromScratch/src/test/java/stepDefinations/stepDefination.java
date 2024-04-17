package stepDefinations;

import static org.junit.Assert.*;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;
import POJO.AddPlace;
import POJO.Location;

public class stepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data=new TestDataBuild();
	static String place_id;
	
	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
		res=given().spec(requestSpecifications())
		.body(data.addPlacePayload(name, language, address));
	   
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		
		APIResources responseAPI = APIResources.valueOf(resource);
		System.out.println(responseAPI.getResource());
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
		response =res.when().post(responseAPI.getResource());
		
		else if(method.equalsIgnoreCase("GET"))
		response =res.when().get(responseAPI.getResource());
			
	}
	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer int1) {
	   
		assertEquals(response.getStatusCode(),200);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) {
	    
		
		assertEquals(getJSONPath(response,keyValue),ExpectedValue);
		
		
	}
	
	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
	    
		place_id = getJSONPath(response,"place_id");
		res=given().spec(requestSpecifications()).queryParam("place_id",place_id);
		user_calls_with_http_request(resource,"GET");
		String actualName = getJSONPath(response,"name");
		assertEquals(actualName, expectedName);
	}
	
	@Given("DeletePlace Payload")
	public void deleteplace_Payload() throws IOException {
	   
	   
		res =given().spec(requestSpecifications()).body(data.deletePlacePayload(place_id));
	}


}
