package ysjhaha.lines.custmannotations.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleAController {

    @GetMapping("/sample/a")
    public Object getA(){
        return "AA";
    }
}
