package org.example.PatternObserver;

public class Gentile implements ISubscriber {
    @Override
    public String sendMessage(String message) {
        String messGentil = null;
        switch (message){
            case "solar eclipse":
                messGentil = "ALARM: " + message;
                break;
            default:
                messGentil = "INFO: " + message;
        }

        return messGentil;
    }
}
