package ro.uaic.info.MailApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MailController {

    @GetMapping("/mail")
    public Mailbox mailbox(){
        Mailbox mailbox = MailApplication.createMails();

        return mailbox;
    }

    @GetMapping("/mail/give")
    public List<Mail> mail(){
        Mailbox mailbox = MailApplication.createMails();

        return mailbox.giveMeMails();
    }
}
