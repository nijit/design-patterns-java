package observerdesignpattern;

public class Subscriber implements Observer {
    String name;
    ObservableOrSubject channel;
    public Subscriber(String name, ObservableOrSubject channel){
        this.name = name;
        this.channel = channel;
    }
    @Override
    public void update(){
        System.out.println("Hey "+name+ "! new vid from "+ channel.getChannelName());
    }
}
