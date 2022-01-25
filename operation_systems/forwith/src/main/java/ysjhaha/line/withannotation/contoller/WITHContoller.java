package ysjhaha.line.withannotation.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WITHContoller {
    @GetMapping("/forwith/a")
    public Object getWITH() {
        return "WITH";
    }
}
