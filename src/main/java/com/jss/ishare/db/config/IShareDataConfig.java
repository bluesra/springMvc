package com.jss.ishare.db.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;


/**
 * Created by Jack Yang on 6/12/2015.
 */
@Configuration
@EnableJpaRepositories("com.jss.ishare.db")
public class IShareDataConfig {

//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .addScript("classpath:/com/habuma/spitter/db/jpa/schema.sql")
//                .addScript("classpath:/com/habuma/spitter/db/jpa/test-data.sql")
//                .build();
//    }

    @Bean(destroyMethod="close")
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/isharedb");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("ais");
        dataSource.setPassword("ais0078");
        dataSource.setInitialSize(20);

        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
//        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        return adapter;
    }
//    EntityManagerFactory
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource());
//        emf.setPersistenceUnitName("spitter");
        emf.setJpaVendorAdapter(jpaVendorAdapter());
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        emf.setJpaProperties(properties);
        emf.setPackagesToScan("com.jss.ishare.domain");
        return emf;
    }

//    @Bean
//    public JpaTransactionManager transactionManager() {
//        return new JpaTransactionManager(); // does this need an emf???
//    }
}
