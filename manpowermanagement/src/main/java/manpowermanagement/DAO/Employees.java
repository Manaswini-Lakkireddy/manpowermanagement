package manpowermanagement.DAO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;

@Entity
public class Employees {

	@Id
	private String Emp_ID;
	@Column
	private String Emp_Name;
	private int Emp_Type;
	private String Emp_Mail;
	private long Emp_Phone;
	private String Emp_Designation;
	private String Emp_Skills;
    private String Proj_ID;
		public String getEmp_ID() {
			return Emp_ID;
		}
		public void setEmp_ID(String emp_ID) {
			Emp_ID = emp_ID;
		}
		public String getEmp_Name() {
			return Emp_Name;
		}
		public void setEmp_Name(String emp_Name) {
			Emp_Name = emp_Name;
		}
		public int getEmp_Type() {
			return Emp_Type;
		}
		public void setEmp_Type(int emp_Type) {
			Emp_Type = emp_Type;
		}
		public String getEmp_Mail() {
			return Emp_Mail;
		}
		public void setEmp_Mail(String emp_Mail) {
			Emp_Mail = emp_Mail;
		}
		public long getEmp_Phone() {
			return Emp_Phone;
		}
		public void setEmp_Phone(long emp_Phone) {
			Emp_Phone = emp_Phone;
		}
		public String getEmp_Designation() {
			return Emp_Designation;
		}
		public void setEmp_Designation(String emp_Designation) {
			Emp_Designation = emp_Designation;
		}
		public String getEmp_Skills() {
			return Emp_Skills;
		}
		public void setEmp_Skills(String emp_Skills) {
			Emp_Skills = emp_Skills;
		}
		
		public void setProj_ID(String proj_ID) {
			Proj_ID = proj_ID;
		}
		public String getProj_ID() {
			return Proj_ID;
		}
}