package org.example.PatternObserver;

public class Astronom implements ISubscriber {
    @Override
    public String sendMessage(String message) {
        String messAstro = null;

        switch (message) {
            case "Sun's up":
                messAstro = message + ". Go Home";
                break;
            case "Sun in zenit":
                messAstro = "ALARM: " + message;
                break;
            default:
                messAstro = "INFO: " + message;
        }
        return messAstro;
    }

}



