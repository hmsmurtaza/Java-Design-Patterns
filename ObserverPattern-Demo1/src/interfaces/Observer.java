package interfaces;

public interface Observer {
    void update(String description);
    void subscribe();
    void unsubscribe();
}
