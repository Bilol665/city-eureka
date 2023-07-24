package uz.pdp.cityeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CityEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityEurekaApplication.class, args);
    }

}
