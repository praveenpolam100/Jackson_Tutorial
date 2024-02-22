package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonPropertySpaceVariablePojo {
	
	private int id;
	@JsonProperty("full name")
	private String fullname;
	private boolean graduate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public boolean isGraduate() {
		return graduate;
	}
	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}
	
	
	

}
