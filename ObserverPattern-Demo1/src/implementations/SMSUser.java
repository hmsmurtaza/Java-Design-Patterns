package implementations;

import interfaces.Observer;
import interfaces.Subject;

import java.awt.im.InputMethodRequests;

public class SMSUser implements Observer {
    private Subject subject;
    private String description;
    private String userInformation;

    public SMSUser(Subject subject, String userInformation) {
        if (subject == null) {
            throw new IllegalArgumentException("No publisher found.");
        }
        this.subject = subject;
        this.userInformation = userInformation;
    }

    @Override
    public void update(String description) {
        this.description = description;
        display();
    }

    private void display() {
        System.out.println("["+userInformation+"] : " + description);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInformation+" to " + subject.subjectDetails()+"...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unsubscribe() {
        System.out.println("Unsubscribing "+ userInformation + " to " + subject.subjectDetails()+"...");
        this.subject.unsubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }
}
