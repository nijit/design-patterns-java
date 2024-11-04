package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ObservableOrSubject {
    private String channelName;
    private List<Observer> subscriberList = new ArrayList<>();

    public Channel(String channelName){
        this.channelName = channelName;
    }
    public String getChannelName(){
        return channelName;
    }

    @Override
    public Channel addSubscriber(Observer subscriber){
        subscriberList.add(subscriber);
        return this;
    }
    @Override
    public void removeSubscriber(Observer subscriber){
        subscriberList.remove(subscriber);
    }

    @Override
    public void uploadVideo(String name){
        System.out.println("Video uploaded = "+ name);
        notifySubscribers();
    }

    public void notifySubscribers() {
        for (Observer s : subscriberList) {
            s.update();
        }
    }

}
