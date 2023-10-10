package org.example.PatternObserver;

public class Astronom implements ISubscriber {
    @Override
    public String sendMessage(String message) {
        String messAstro = "INFO: " + message;

        System.out.println(messAstro);
        return messAstro;
    }

}



