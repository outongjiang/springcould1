package person.otj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer//可以接收别人注册进来
public class SpringcouldEureka {
    public static void main(String[] args) {
        SpringApplication.run(SpringcouldEureka.class,args);
    }
}
