package person.otj.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import person.otj.pojo.Student;
import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer")
    public List<Student> consumer(Student student){
        return restTemplate.postForObject("http://localhost:7001/provider",student,List.class);
    }

}