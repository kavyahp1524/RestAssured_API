package Rest;

import org.testng.annotations.BeforeClass;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Common {
	
	String id = "";
	String Uri = "https://api.trello.com/1/boards/"+id;
	
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	
	@BeforeClass
	public void RequestAndResponse() {
		
		RequestSpecBuilder build = new RequestSpecBuilder();
		
		build.setBaseUri(Uri);
		
		build.addQueryParam("key","2edce6357dccf29f5196de5da63e18ec");
		build.addQueryParam("token", "ATTA38d004b604abbd76038ea24231c2ce5b0cd523399eea0199bb9a15238a815273437DCC1F");
		build.addHeader("Content-Type","application/json");
		build.setAccept("application/json");
		build.setContentType("application/json");
		
		requestSpec = build.build();
		

		
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		
		builder.expectStatusCode(200);
		
		responseSpec = builder.build();
	}

}
