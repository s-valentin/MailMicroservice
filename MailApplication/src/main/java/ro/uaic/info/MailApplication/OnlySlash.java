package ro.uaic.info.MailApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OnlySlash {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}