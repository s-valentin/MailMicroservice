package ro.uaic.info.MailApplication;

import java.time.LocalDate;

public class Mail {
    //TODO Andrei fa un alt insert pt astea pupati-as pula ta - Razvan. :)
    private MailAddress from;
    private MailAddress to;
    private String subject;
    private String content;
    private LocalDate date;
    private boolean isRead;
    private MailType type;
    enum MailType{SPAM,INBOX,TRASH,SENT};
}