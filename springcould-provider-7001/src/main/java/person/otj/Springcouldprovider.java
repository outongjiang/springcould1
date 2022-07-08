package person.otj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("person.otj.dao")
public class Springcouldprovider {
    public static void main(String[] args) {
        SpringApplication.run(Springcouldprovider.class,args);
    }
}
