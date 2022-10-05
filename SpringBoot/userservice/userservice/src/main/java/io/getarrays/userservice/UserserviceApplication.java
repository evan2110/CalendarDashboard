package io.getarrays.userservice;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}



	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John Travolta", "John", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will LinCon", "Will", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Evan Duck", "Evan",  "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Patrick Eva", "Patrick", "1234", new ArrayList<>()));

			userService.addRoleToUser("John", "ROLE_USER");
			userService.addRoleToUser("Will", "ROLE_MANAGER");
			userService.addRoleToUser("Evan", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Patrick", "ROLE_ADMIN");
			userService.addRoleToUser("John", "ROLE_MANAGER");
			userService.addRoleToUser("Patrick", "ROLE_MANAGER");
			userService.addRoleToUser("Evan", "ROLE_USER");
			userService.addRoleToUser("Evan", "ROLE_MANAGER");
			userService.addRoleToUser("Evan", "ROLE_ADMIN");

		};
	}

}
