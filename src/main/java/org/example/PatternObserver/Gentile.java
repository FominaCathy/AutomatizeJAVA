package org.example.PatternObserver;

public class Gentile implements ISubscriber {
    @Override
    public String sendMessage(String message) {
        String messGentil = "ALARM: " + message;
        System.out.println(messGentil);
        return messGentil;
    }
}
