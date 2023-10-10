package org.example.MontyHall;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

public class PlayGameTest extends AbstractTestMH {

    static List<Door> doors;

    @BeforeEach
    void createListDoors() {
        //первая дверь - выигрышная.
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }

    @Test
    void testGamerTrueAndChoiceDoorOne() {
        //given
        Game game = new Game(gamerTrue, doors);
        //when - выбираем первую дверь и потом ее меняем
        Door choiceDore = game.round(0);
        //then - проиграли
        Assertions.assertFalse(choiceDore.isPrize());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testGamerTrueAndChoiceDoorNotOne(int choice) {
        //given
        Game game = new Game(gamerTrue, doors);
        //when - выбираем вторую и потом третью двери и потом ее меняем
        Door choiceDore = game.round(choice);
        //then - выиграли
        Assertions.assertTrue(choiceDore.isPrize());
    }


    @Test
    void testGamerFalseAndChoiceDoorOne() {
        //given
        Game game = new Game(gamerFalse, doors);
        //when - выбираем первую дверь и ее не меняем
        Door choiceDore = game.round(0);
        //then - проиграли
        Assertions.assertTrue(choiceDore.isPrize());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testGamerFalseAndChoiceDoorNotOne(int choice) {
        //given
        Game game = new Game(gamerFalse, doors);
        //when - выбираем вторую и потом третью двери и ее не меняем
        Door choiceDore = game.round(choice);
        //then - выиграли
        Assertions.assertFalse(choiceDore.isPrize());
    }
}
