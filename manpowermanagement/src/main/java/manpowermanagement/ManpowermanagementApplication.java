package manpowermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
//@ComponentScan("Client.java,ClientController.java,ClientRepository.java,ClientService.java,ResourceNotFoundException.java")
@EnableWebSecurity
public class ManpowermanagementApplication {

	public static void main(String[] args) {
		  
		 
		SpringApplication.run(ManpowermanagementApplication.class, args);
		
			 
	}

}
