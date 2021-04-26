package ro.uaic.info.MailApplication;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Properties;

@RestController
public class MailController {

    @Autowired
    private static JavaMailSenderImpl mailSender;

    @BeforeAll
    public static void setup() {
        mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("your_email");
        mailSender.setPassword("your_password");

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        mailSender.setJavaMailProperties(properties);
    }

    @PostMapping("/send_text_email")
    public String sendPlainTextEmail(@RequestBody Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mail.getFrom());
        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getContent());

        mailSender.send(message);

        return "result";
    }

    @PostMapping("/request")
    public ResponseEntity postController(
            @RequestBody MailCfg user) {
        System.out.println(user.port);
        System.out.println(user.host);
        System.out.println(user.username);
        System.out.println(user.password);

        mailSender = new JavaMailSenderImpl();
        mailSender.setHost(user.host);
        mailSender.setPort(user.port);
        mailSender.setUsername(user.username);
        mailSender.setPassword(user.password);

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        mailSender.setJavaMailProperties(properties);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
