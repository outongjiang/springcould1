package person.otj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcouldEureka2 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcouldEureka2.class, args);
    }
}
