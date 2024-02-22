package jsontopojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.AddressNonDefault;
import pojo.AddressNonEmpty;

public class JsonToProjoAddressNonEmpty {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TODO Auto-generated method stub
		
		
		ObjectMapper objectmapper = new ObjectMapper();
		
		AddressNonEmpty addressnondefault = 
		objectmapper.readValue((new File("C:\\eclipse-workspace\\Jackson_Tutorial\\src\\test\\resources\\payloads\\address_defaults.json")), AddressNonEmpty.class);
		
		
		
		  addressnondefault.setName("Praveen"); 
		  addressnondefault.setAge(40);
		  addressnondefault.setGrade(12);
		  addressnondefault.setAddress("no address");
		  addressnondefault.setAddresses(new HashMap<>());
		  addressnondefault.setProfession(new ArrayList<>());
		 
		  //addressnondefault.setId(1001);
		  
		  String updatedJson =
		  objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(addressnondefault);
		  
		  System.out.println(updatedJson);
		 
		 

	}

}
