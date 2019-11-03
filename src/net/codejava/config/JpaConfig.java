package net.codejava.config;
 
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
@Configuration
//- @EnableJpaRepositories : diz ao Spring Data JPA para procurar 
//classes de repositório no pacote especificado (net.codejava) para injetar código 
//relevante no tempo de execução.
@EnableJpaRepositories(basePackages = {"net.codejava.customer"}) 

//- @EnableTransactionManagement : informa ao Spring Data JPA para gerar
// código para gerenciamento de transações em tempo de execução.
@EnableTransactionManagement
public class JpaConfig {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("SalesDB");
        return factoryBean;
    }
      
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    } 
}