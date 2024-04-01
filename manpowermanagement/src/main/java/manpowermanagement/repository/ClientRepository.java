package manpowermanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import manpowermanagement.DAO.Client;

//import com.manpower.co.manpowermanagement.ClientService;

	
@Repository
     public interface ClientRepository extends JpaRepository<Client,String>
	 {
	
	 }
		// TODO Auto-generated method stub
