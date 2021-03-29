package ro.uaic.info.MailApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailApplication {

    public static void main(String[] args) {

        SpringApplication.run(MailApplication.class, args);
    }


    public static Mailbox createMails() {

        MailAddress sender = new MailAddress("cosmin@info.uaic.ro");
        MailAddress receiver = new MailAddress("marius@info.uaic.ro");
        Mail mail1 = new Mail(sender, receiver,
                "This is an email", "Content xD" );
        Mail mail2 = new Mail(sender, receiver,
                "Hehe thy stupid me", "Only slash");
        Mail mail3 = new Mail(sender, receiver,
                "And anotha one", "Only fans");

        Mailbox mailbox = new Mailbox("SCRUMMAIL");

        mailbox.addEmail(mail1);
        mailbox.addEmail(mail2);
        mailbox.addEmail(mail3);

        return mailbox;
    }


}
