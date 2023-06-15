package POJOMethod;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class TestJsonObject {
	
	@Test
	public void json() throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();	
	   
	    File jsonfile = new File("C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\Restassured\\src\\test\\resources\\payLoad\\resource.json");
	    JsonPojo Class = objectMapper.readValue(jsonfile,JsonPojo.class);
			
		String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(Class);
		System.out.println(jsonString);
		      
	}

}
