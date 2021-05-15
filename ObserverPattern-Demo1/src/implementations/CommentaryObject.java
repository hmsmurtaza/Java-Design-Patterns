package implementations;

import interfaces.Commentary;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class CommentaryObject implements Subject , Commentary {
    private ArrayList<Observer> observerArrayList;
    private String description;
    private final String subjectDetails;

    public CommentaryObject(ArrayList<Observer> observerArrayList,
                            String subjectDetails) {
        this.subjectDetails = subjectDetails;
        this.observerArrayList = observerArrayList;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
        notifyObserver();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observerArrayList.add(observer);
        notifyObserver();
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        int index = observerArrayList.indexOf(observer);
        observerArrayList.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerArrayList) {
            observer.update(this.description);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
