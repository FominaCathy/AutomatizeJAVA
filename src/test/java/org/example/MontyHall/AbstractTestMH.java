package org.example.MontyHall;

import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTestMH {
    static Player gamerTrue;
    static Player gamerFalse;

    @BeforeAll
    static void createGamers() {
        gamerTrue = new Player("GamerTrue", true);
        gamerFalse = new Player("GamerTrue", false);
    }



}
