package jsontopojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class JsonToPojoAddress {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper objectmapper = new ObjectMapper();
		Address address = objectmapper.readValue(
				new File("C:\\eclipse-workspace\\Jackson_Tutorial\\src\\test\\resources\\payloads\\address.json"), Address.class );
		
		System.out.println(address.getAddress());
		
		address.setAddress("9491 amberwoods ln, frisco, TX 75035");
		System.out.println(address.getAddress());
		
		String updatedJson = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(updatedJson);
		
	}

}
