package ysjhaha.line.operation_systems.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContoller {

    @GetMapping("/main")
    public Object getMain() {
        return "AA";
    }
}
