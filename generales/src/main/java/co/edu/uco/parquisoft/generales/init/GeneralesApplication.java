package co.edu.uco.parquisoft.generales.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "co.edu.uco.parquisoft" })
@EnableJpaRepositories("co.edu.uco.parquisoft.generales.application.secondaryports.repository")
@EntityScan("co.edu.uco.parquisoft.generales.application.secondaryports.entity")
public class GeneralesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralesApplication.class, args);
	}

}
