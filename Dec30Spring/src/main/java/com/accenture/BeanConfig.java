package com.accenture;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

// To make codes simpler, add @ as below
@ComponentScan(basePackages = " com.accenture")
@PropertySource("classpath:datasource.properties")
public class BeanConfig {
	
	
	@Autowired
	Environment environment;
	
	//Getting from datasource.properties
	private String URL = "url";
	private String USERNAME = "username";
	private String PASSWORD = "password";
	
	
	@Bean("connection")
	public JdbcTemplate getTemplateObject()throws Exception {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty(URL));
		dataSource.setUsername(environment.getProperty(USERNAME));
		dataSource.setPassword(environment.getProperty(PASSWORD));
		
		return new JdbcTemplate(dataSource);
		
		
		
		
		// Commented out to simplify codes, as below
		
		
//		JdbcTemplate template=null;
//		DriverManagerDataSource dataSource=null;
		
		//Right click on datasource.properties, preference, to get the path
//		String path = "/Users/lesterzeng/Documents/workspace-spring-tool-suite-4-4.17.0.RELEASE/Dec30Spring/src/main/java/datasource.properties";
		
//		FileInputStream fis = new FileInputStream(path);
//		Properties p = new Properties();
//		p.load(fis);
		
		//Getting from datasource.properties - should be in src/main/java. Deleted after code simplification.
//		String url = p.getProperty("url");			//Comment out to simplify code
//		String userName = p.getProperty("username");
//		String password = p.getProperty("password");
		

//		dataSource = new DriverManagerDataSource(); //Comment out to simplify code
//		dataSource.setUrl(url);
//		dataSource.setUsername(userName);
//		dataSource.setPassword(password);
//		
//		template = new JdbcTemplate(dataSource);
		
//		return template;
	}
}
