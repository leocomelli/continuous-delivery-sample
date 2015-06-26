package br.com.devmedia.cdsample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
 
@Configuration
@ComponentScan(value = "br.com.devmedia.cdsample.service")
@PropertySource("classpath:version.properties")
public class AppConfigTest {

}
