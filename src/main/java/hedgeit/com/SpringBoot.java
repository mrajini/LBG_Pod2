package hedgeit.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class SpringBoot {
        @GetMapping("/hello")
        public String getHelloMessage() {
            return "Hello Spring Boot world";
        }
    }

