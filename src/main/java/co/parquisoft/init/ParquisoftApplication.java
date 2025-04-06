package co.parquisoft.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"co.parquisoft"})
@EnableJpaRepositories("co.parquisoft.application.secondaryports.repository")
@EntityScan("co.parquisoft.application.secondaryports.entity")
public class ParquisoftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParquisoftApplication.class, args);
    }

}
