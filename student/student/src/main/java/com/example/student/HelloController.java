package com.example.student;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  public String sayHello() {
    return "Hello from Spring Boot!";
  }

  @PostMapping("/greet")
  public Greeting greetUser(@RequestBody User user) {
    return new Greeting("Hello, " + user.getName() + "!",user.getAge());
  

  }
}
