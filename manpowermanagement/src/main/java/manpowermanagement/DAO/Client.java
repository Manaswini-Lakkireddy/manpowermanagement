package manpowermanagement.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Client {

	@Id
	private String CLI_ID;
	@Column
	private String CLI_Name;
	public String getId() {
		return CLI_ID;
	}
	public void setId(String id) {
		CLI_ID = id;
	}
	public String getName() {
		return CLI_Name;
	}
	public void setName(String name) {
		CLI_Name = name;
	}
	
}