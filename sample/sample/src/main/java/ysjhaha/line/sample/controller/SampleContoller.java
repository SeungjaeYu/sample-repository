package ysjhaha.line.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoller {
    @GetMapping("helloworld")
    public Object helloWorld() {
        return "Hello World";
    }
}
