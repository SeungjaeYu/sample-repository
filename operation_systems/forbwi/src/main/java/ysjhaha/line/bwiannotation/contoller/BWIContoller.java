package ysjhaha.line.bwiannotation.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BWIContoller {

    @GetMapping("/forbwi/a")
    public Object getBWI() {
        return "BWI";
    }

}
