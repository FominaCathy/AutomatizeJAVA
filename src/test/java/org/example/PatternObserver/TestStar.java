package org.example.PatternObserver;

import org.junit.jupiter.api.Test;

public class TestStar {

    @Test
    void testSunUp(){
        Star sun = new Star();
        ISubscriber priest = new Gentile();
        ISubscriber astro = new Astronom();

        sun.addSender(priest);
        sun.addSender(astro);

        sun.notifySubscriber("Sun's up");

    }
}
