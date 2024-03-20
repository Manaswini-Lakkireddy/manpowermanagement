package com.manpower.co.manpowermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("com.manpower.co.manpowermanagement.repository")
public class ManpowermanagementApplication {

	public static void main(String[] args) {
		  
		 
		SpringApplication.run(ManpowermanagementApplication.class, args);
		
			 
	}

}
