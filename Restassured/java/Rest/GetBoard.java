package Rest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class GetBoard extends CreateBoard{
	
	@Test
	public void getboard() {
	
	 given()
	 .spec(requestSpec)
	 .expect()
	 .spec(responseSpec)
	 .when()
	 .get(id);

	}

}
