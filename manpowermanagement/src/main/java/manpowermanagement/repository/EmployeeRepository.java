package manpowermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import manpowermanagement.DAO.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,String>
{

}