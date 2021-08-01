package com.training.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({ AppConfig.class, SpringConfig.class })
@ImportResource({ "demo1.xml" })
public class RootConfig {

}
