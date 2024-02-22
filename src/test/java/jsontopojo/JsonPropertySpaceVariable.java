package jsontopojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.JsonPropertySpaceVariablePojo;

public class JsonPropertySpaceVariable {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		JsonPropertySpaceVariablePojo jpsp = new JsonPropertySpaceVariablePojo();
		jpsp.setFullname("Praveen Polam");
		jpsp.setGraduate(true);
		jpsp.setId(1001);
		
		ObjectMapper om = new ObjectMapper();
		String serializedString = om.writerWithDefaultPrettyPrinter().writeValueAsString(jpsp);
		System.out.println(serializedString);
		
		jpsp.setFullname("Prashanth Polam");
		jpsp.setGraduate(true);
		jpsp.setId(1002);
		
		String serializedString1 = om.writerWithDefaultPrettyPrinter().writeValueAsString(jpsp);
		
		JsonPropertySpaceVariablePojo jpsv = om.readValue(serializedString1, JsonPropertySpaceVariablePojo.class);
		
		System.out.println(jpsv.isGraduate());
		System.out.println(jpsv.getFullname());
		
		
		
	}

}
