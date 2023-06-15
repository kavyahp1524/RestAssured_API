package schemaValidation;

import java.io.File;
import org.testng.annotations.Test;
import io.restassured.module.jsv.JsonSchemaValidator;


public class SchemaValidation {
	
	@Test
	public void jsonSchema()  {
		      
		JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\Restassured\\src\\test\\resources\\payLoad\\resource.json"));

	}

}
