package manpowermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import manpowermanagement.DAO.Projects;



@Repository
public interface ProjectRepository extends JpaRepository<Projects,String>
{

}