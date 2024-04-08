package manpowermanagement.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import manpowermanagement.DAO.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,String>
{
//	@Query("SELECT * FROM Employees a JOIN Projects b on a.proj_id=b.proj_id WHERE b.proj_id = projectId")
//    public static List<Employees> fetchEmpProjDataJoin(@Param("projectId") String projectId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}                     