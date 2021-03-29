package ro.uaic.info.MailApplication;

import java.time.LocalDate;

public class Mail {

    private MailAddress from;
    private MailAddress to;
    private String subject;
    private String content;
    private LocalDate date;
    private boolean isRead;
    private MailType type;

    public Mail(MailAddress from,
                MailAddress to,
                String subject,
                String content) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
        this.date = LocalDate.now();
        this.type = MailType.INBOX;
        isRead = false;
    }

    public MailAddress getFrom() {
        return from;
    }

    public void setFrom(MailAddress from) {
        this.from = from;
    }

    public MailAddress getTo() {
        return to;
    }

    public void setTo(MailAddress to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public boolean isRead() { return isRead; }

    @Override
    public String toString() {
        return "Mail{" +
                "from=" + from.getEmail() +
                ", to=" + to.getEmail() +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", isRead=" + isRead +
                ", type=" + type +
                '}' + "\n";
    }
}