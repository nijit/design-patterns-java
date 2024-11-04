package observerdesignpattern;

public interface ObservableOrSubject {
    Channel addSubscriber(Observer subscriber);

    void removeSubscriber(Observer subscriber);

    void uploadVideo(String name);
    String getChannelName();
}
