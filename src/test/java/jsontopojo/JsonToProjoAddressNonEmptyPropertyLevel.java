package jsontopojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.AddressNonDefault;
import pojo.AddressNonEmpty;
import pojo.JsonincludepropertyLevel;


public class JsonToProjoAddressNonEmptyPropertyLevel {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub
		
		
		ObjectMapper objectmapper = new ObjectMapper();
		
		JsonincludepropertyLevel propertylevel = 
		objectmapper.readValue((new File("C:\\eclipse-workspace\\Jackson_Tutorial\\src\\test\\resources\\payloads\\address_defaults.json")), JsonincludepropertyLevel.class);
		
		
		
		propertylevel.setName("Praveen"); 
		propertylevel.setAge(40);
		propertylevel.setGrade(12);
		propertylevel.setAddress("no address");
		propertylevel.setAddresses(new HashMap<>());
		propertylevel.setProfession(new ArrayList<>());
		 
		  //addressnondefault.setId(1001);
		  
		  String updatedJson =
		  objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(propertylevel);
		  
		  System.out.println(updatedJson);
		 
		 

	}

}
