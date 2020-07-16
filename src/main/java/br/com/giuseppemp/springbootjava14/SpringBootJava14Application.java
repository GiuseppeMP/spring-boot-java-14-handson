package br.com.giuseppemp.springbootjava14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/home")
public class SpringBootJava14Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJava14Application.class, args);
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
