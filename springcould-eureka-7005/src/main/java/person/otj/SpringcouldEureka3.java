package person.otj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class SpringcouldEureka3 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcouldEureka3.class,args);
    }
}
