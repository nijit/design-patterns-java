package observerdesignpattern;

public class Youtube {
    public static void main(String[] args) {
        ObservableOrSubject channel = new Channel("Telusko");
        channel.addSubscriber( new Subscriber("nijit", channel)).addSubscriber(new Subscriber("suzit",channel)).addSubscriber(new Subscriber("bijit",channel));
        channel.uploadVideo("How to code");

    }
}
