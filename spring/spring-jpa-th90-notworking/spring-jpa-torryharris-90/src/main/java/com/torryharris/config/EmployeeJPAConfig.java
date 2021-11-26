package com.torryharris.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.torryharris.dao.EmployeeManager;
import com.torryharris.dao.EmployeeManagerImpl;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages={"com.torryharris.dao","com.torryharris.model","com.torryharris.config"})
public class EmployeeJPAConfig {
	
	@Bean
	public EmployeeManager getEmployeeManager(){
		return new EmployeeManagerImpl();
	}

	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/company");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	
	public Properties getHibernateProperties(){
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		return properties;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(getDataSource());
		em.setPackagesToScan(new String[] {"com.torryharris.model"});
		
		JpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendor);
		em.setJpaProperties(getHibernateProperties());
		return em;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(){
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
}
