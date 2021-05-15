import implementations.CommentaryObject;
import implementations.SMSUser;
import interfaces.Commentary;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer " +
                "Match [2014AUG24");
        Observer observer = new SMSUser(subject, "Muhammad Shoaib [Sillanwali]");
        observer.subscribe();

        System.out.println();

        Observer observer1 = new SMSUser(subject, "Hadi Murtaza [Sillanwali]");
        observer1.subscribe();

        Commentary commentary = (Commentary) subject;
        commentary.setDescription("Welcome to live soccer match");
        commentary.setDescription("Current score 0-0");

        System.out.println();

        observer.unsubscribe();

        System.out.println();

        commentary.setDescription("It's a goal!!");
        commentary.setDescription("Current score 1-0");

        System.out.println();

        Observer observer2 = new SMSUser(subject, "Abbas [Sargodha]");
        observer2.subscribe();

        System.out.println();

        commentary.setDescription("It's another goal!!!");
        commentary.setDescription("Half-time score 2-0");
    }
}
