package jsontopojo;
import pojo.JsonIgnorePropertyAddress;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//This will cover extract values from dynamic Json
//This will cover ignoring the unknown properties during the decerialization
//use of the @JsonIgnoreProperties

public class JsonIgnorePropertyTag {
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String body = "{\r\n"
				+ "   \"name\":\"John Doe\",\r\n"
				+ "   \"age\":20,\r\n"
				+ "   \"grade\":11,\r\n"
				+ "   \"address\":\"123 Main St, Anytown, Anystate, 12345\"\r\n"
				+ "}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonIgnorePropertyAddress address = objectMapper.readValue(body, JsonIgnorePropertyAddress.class);
		
		String updatedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		
		System.out.println(updatedJson);
		
		//we added additional property skills here
		String body1 = "{\r\n"
				+ "   \"name\":\"John Doe\",\r\n"
				+ "   \"age\":20,\r\n"
				+ "   \"grade\":11,\r\n"
				+ "   \"address\":\"123 Main St, Anytown, Anystate, 12345\",\r\n"
				+ "   \"skills\": \"Java\"\r\n"
				+ "}";
		
			
		address = objectMapper.readValue(body1, JsonIgnorePropertyAddress.class);
		
		updatedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		
		System.out.println(updatedJson);
		
		
	}
	
	

}
