package co.chaiwatm.demoapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/v1/hello")
    public String index() {
        return "hello";
    }
}