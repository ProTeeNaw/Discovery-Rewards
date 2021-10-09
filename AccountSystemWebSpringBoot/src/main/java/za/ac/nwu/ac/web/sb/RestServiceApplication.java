package za.ac.nwu.ac.web.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(scanBasePackages = {"za.ac.nwu.ac.logic"})
//@EntityScan("za.ac.nwu.ac.domain")
//@EnableJpaRepositories("za.ac.nwu.ac.repo")
public class RestServiceApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}