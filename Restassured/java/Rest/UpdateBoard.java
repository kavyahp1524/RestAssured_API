package Rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class UpdateBoard extends GetBoard{
	
	@Test
	public void updateBoard() {
		
		given()
		.queryParam("name","Kavyashree")
		.spec(requestSpec)
		.expect()
		.spec(responseSpec)
		.when()
		.put(id);
		
	}
}
