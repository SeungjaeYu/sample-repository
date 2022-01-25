package ysjhaha.line.pmsannotation.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PMSContoller {
    @GetMapping("/forpms/a")
    public Object getPMS() {
        return "PMS";
    }
}
