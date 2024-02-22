package jsontopojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class UpdateJsonwithoutPojo {
	
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper objectmapper = new ObjectMapper();
		
		Map <String, Object> address = 
		objectmapper.readValue(
				new File("C:\\eclipse-workspace\\Jackson_Tutorial\\src\\test\\resources\\payloads\\address.json"), new TypeReference<Map<String, Object>>(){});
		
		System.out.println(address.get("address"));
		
		address.put("address", "9491 amberwoods ln, frisco, TX 75035");
		System.out.println(address.get("address"));
		
		
		String updatedJson = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(updatedJson);
		
	}

}
