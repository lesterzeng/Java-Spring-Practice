package com.accenture;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.p1.Tyre;

@Configuration // Indicates that the class has bean definition,
//so Spring container can process
// the class and generate the Spring beans to be used in the application.
@ComponentScan (basePackages = {"com.accenture", "com.p1"})
public class BeanConfig  {

}
