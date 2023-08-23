package com.Jocata.IDfy.CONFIG;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.activation.DataSource;
import java.util.Properties;

public class Config {

    @Value("${spring.datasource.driver-class-name}")
    private String driverclass;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.jpa.properties.hibernate.dialect}")
    private String dialect;

    @Bean
    public DataSource getDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
        dataSource.setDriverClassName(driverclass);
        return (DataSource) dataSource;

    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {

        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
         /*factory.setDataSource(getDataSource());
        factory.setHibernateProperties(hibernateProperties());*/
        factory.setPackagesToScan(new String[]{"com.Jocata.IDfy.DATAMODEL"});
        return factory;
    }

    private Properties hibernateProperties() {

        Properties properties = new Properties();
     properties.put("hibernate.dialect", dialect);

        properties.put("hibernate.hbm2ddl", "update");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");

        return properties;
    }


}

