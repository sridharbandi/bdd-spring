package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application-${env:dev}.properties")
@ComponentScan("org.example")
public class Config {

}
