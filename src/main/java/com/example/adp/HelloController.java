package com.example.adp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }
    @GetMapping("/helloagain")
    public String[] helloAgain() {
        return new String[] { "hello world!", "again", "hang on what's this?", "dice", "prune", "music" };
    }
    @GetMapping("/pojo")
    public MyPOJO[] myPojo() {
        return new MyPOJO[] {
                new MyPOJO("Josiah", "Brown", 1533877),
                new MyPOJO("Ronan", "Lopez", 4923743) };
    }
    @GetMapping("/pojo/{first}/{last}/{id}")
    public MyPOJO myPojo( @PathVariable("first") String firstName,
                          @PathVariable("last") String lastName,
                          @PathVariable("id") int idNumber) {
        return new MyPOJO(firstName, lastName, idNumber);
    }
}
