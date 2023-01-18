package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteReq {
	
	@Test
	public void testCase_Delete() {
		RestAssured.when().
		delete("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/101").
		then().
		statusCode(200).log().all();
		
	}
	

}
