package com.manpower.co.manpowermanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manpower.co.manpowermanagement.DAO.*;

	
@Repository
     public interface ClientRepository extends JpaRepository<Client,String>
	 {
	
	 }
		// TODO Auto-generated method stub
