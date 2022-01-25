package ysjhaha.line.cmsannotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CMSController {

    @GetMapping("forcms/a")
    public Object getCMS() {
        return "CMS";
    }
}
