package vitality.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("vitality.repo.persistence")
@EntityScan("vitality.domain.persistence")
@PropertySource(value = "classpath:application-db.properties")
public class RepositoryConfig {
}