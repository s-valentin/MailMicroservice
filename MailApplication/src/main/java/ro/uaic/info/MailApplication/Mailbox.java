package ro.uaic.info.MailApplication;

public class Mailbox {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void refresh() { }
    void readMail() { }
    void deleteMail() { }
    void deleteAllMails() { }
    int countReadMessages() { return 0; }
    int countUnreadMessages() { return 0; }
    int countSentMessages() { return 0; }
    // Mail compose() { }
    void changeMailbox() { }
}
