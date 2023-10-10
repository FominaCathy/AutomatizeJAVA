package org.example.PatternObserver;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTestPO {
    static Star sun = new Star();


    @BeforeAll
    static void initSun(){
//        ISubscriber priest = new Gentile();
//        ISubscriber astro = new Astronom();

        sun.addSender(new Gentile());
        sun.addSender(new Astronom());

    }

}
