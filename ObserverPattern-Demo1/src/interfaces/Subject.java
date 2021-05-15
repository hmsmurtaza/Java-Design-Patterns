package interfaces;

public interface Subject {
    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
    void notifyObserver();
    String subjectDetails();
}
