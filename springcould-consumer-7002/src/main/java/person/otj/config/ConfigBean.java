package person.otj.config;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean  {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
