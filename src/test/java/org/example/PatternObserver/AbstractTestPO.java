package org.example.PatternObserver;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTestPO {
    static Star sun;
    static ISubscriber priest;
    static ISubscriber astro;

    @BeforeAll
    static void initSubscriber() {

        priest = new Gentile();
        astro = new Astronom();
    }

    @BeforeEach
    void initStar() {
        sun = new Star();
    }


}
