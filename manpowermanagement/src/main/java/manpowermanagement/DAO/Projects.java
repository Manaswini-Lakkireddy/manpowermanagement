package manpowermanagement.DAO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projects {

	@Id
	private String Proj_ID;
	@Column
	private String Proj_Name;
	private String Proj_Duration;
	private String Proj_Status;
	private String Cli_Id;
	
	public String getId() {
		return Proj_ID;
	}
	public void setId(String id) {
		Proj_ID = id;
	}
	public String getName() {
		return Proj_Name;
	}
	public void setName(String name) {
		Proj_Name = name;
	}
	public String getProj_Duration() {
		return Proj_Duration;
	}
	public void setProj_Duration(String proj_Duration) {
		Proj_Duration = proj_Duration;
	}
	public String getProj_Status() {
		return Proj_Status;
	}
	public void setProj_Status(String proj_Status) {
		Proj_Status = proj_Status;
	}
	public String getCli_Id() {
		return Cli_Id;
	}
	public void setCli_Id(String cli_Id) {
		Cli_Id = cli_Id;
	}

	
}