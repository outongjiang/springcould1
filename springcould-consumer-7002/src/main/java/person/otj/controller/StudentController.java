package person.otj.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import person.otj.pojo.Student;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/consumer")
    public List<Student> consumer(Student student){
        return restTemplate.postForObject("http://localhost:7001/provider",student,List.class);
    }

    @GetMapping("/consumer/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery=>services:");
        for (String s:services){
            System.out.println(s);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("UNKNOWN");

        for (ServiceInstance ins:instances){
            System.out.println(
                    "主机名:"+ins.getHost()+"\n"+
                    "端口号:"+ins.getPort()+"\n"+
                    "uri:"+ins.getUri()+"\n"+
                    "服务id:"+ins.getServiceId()


            );
        }
        return  this.discoveryClient;

    }



}