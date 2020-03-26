package io.project.app.unicorn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@Slf4j
public class UnicornApplication {
  

    public static void main(String[] args) {
        SpringApplication.run(UnicornApplication.class, args);
      
    }

}
