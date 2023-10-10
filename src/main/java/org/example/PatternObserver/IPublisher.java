package org.example.PatternObserver;

public interface IPublisher {
    boolean addSender(ISubscriber subscriber);
    boolean removeSender(ISubscriber subscriber);
}
