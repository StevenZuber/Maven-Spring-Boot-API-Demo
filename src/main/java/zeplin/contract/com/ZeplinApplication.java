package zeplin.contract.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration  // Sprint Boot Auto Configuration
@ComponentScan(basePackages = "zeplin.contract.com")
@EntityScan("zeplin.contract.com.domain")
@EnableJpaRepositories("zeplin.contract.repository.dao")
public class ZeplinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeplinApplication.class, args);
		System.out.println("\nNavigate to http://localhost:8080/ to see the list of endpoints");
	}

}

