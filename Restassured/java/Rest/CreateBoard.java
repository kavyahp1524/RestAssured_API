package Rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateBoard extends Common {
	
	
	@Test
	public void creatBoard() {
		
	Response re = given()
				 .queryParam("name","Kavya")
				 .spec(requestSpec)
				 .expect()
				 .spec(responseSpec)
				 .when()
				 .post();
	
	System.out.println(re.asString());
	
	JsonPath jp=new JsonPath(re.asString());
	id = jp.getString("id");
	System.out.println(id);
	
	}
	
}