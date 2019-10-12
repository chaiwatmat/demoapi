package co.chaiwatm.demoapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "hello";
    }
}