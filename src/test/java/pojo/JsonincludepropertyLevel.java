package pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;


public class JsonincludepropertyLevel {
	
	private int id;
	private String name;
	private int age;
	private int grade;
	private String address;
	private List <String> profession;
	private Map<String, Object> addresses;
	
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public List<String> getProfession() {
		return profession;
	}
	public void setProfession(List<String> profession) {
		this.profession = profession;
	}
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public Map<String, Object> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, Object> addresses) {
		this.addresses = addresses;
	}

}
