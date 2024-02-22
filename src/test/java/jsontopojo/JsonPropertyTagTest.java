package jsontopojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Jsonpropertytag;

public class JsonPropertyTagTest {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper om = new ObjectMapper();
		Jsonpropertytag jpt = 
		om.readValue(new File("C:\\eclipse-workspace\\Jackson_Tutorial\\src\\test\\resources\\payloads\\address.json"), Jsonpropertytag.class);
		
		jpt.setName("Praveen");
		jpt.setAge(40);
		jpt.setGrade(12);
		jpt.setAddress("9493 Amberwoods ln");
		jpt.setSkills("Testing");
		
		System.out.println(jpt.getAddress());
		
		String getonlyRequired = om.writerWithDefaultPrettyPrinter().writeValueAsString(jpt);
		System.out.println(getonlyRequired);
		
		
		
		
	}

}
