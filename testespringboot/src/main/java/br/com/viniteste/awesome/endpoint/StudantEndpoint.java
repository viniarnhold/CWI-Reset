package br.com.viniteste.awesome.endpoint;

import br.com.viniteste.awesome.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudantEndpoint {
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> listAll(){
        return asList(new Student("João", 20, "Matemática"), new Student("Maria", 22, "Filosofia"));
    }
}
