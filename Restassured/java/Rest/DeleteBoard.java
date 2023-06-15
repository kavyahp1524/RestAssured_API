package Rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteBoard extends UpdateBoard {
	
	
	@Test
	public void deletBoard() {
		
		given().spec(requestSpec).expect().spec(responseSpec).when().delete();
	}
	 

}
