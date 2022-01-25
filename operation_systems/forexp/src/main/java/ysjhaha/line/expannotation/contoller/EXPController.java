package ysjhaha.line.expannotation.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EXPController {
    @GetMapping("/forexp/a")
    public Object getEXP() {
        return "EXP";
    }
}
