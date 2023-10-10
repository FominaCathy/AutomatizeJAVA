package org.example.PatternObserver;

import java.util.ArrayList;
import java.util.List;

public class Star implements IPublisher {
    private List<ISubscriber> subscriberList = new ArrayList<>();


    @Override
    public boolean addSender(ISubscriber subscriber) {
        if (!subscriberList.contains(subscriber)) {
            subscriberList.add(subscriber);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeSender(ISubscriber subscriber) {
        if (subscriberList.contains(subscriber)) {
            subscriberList.remove(subscriber);
            return true;
        }

        return false;
    }


    public int notifySubscriber(String message) {
        int count = 0;
        for (ISubscriber item : subscriberList){
            item.sendMessage(message);
            count++;
        }
        return count;

    }
}
