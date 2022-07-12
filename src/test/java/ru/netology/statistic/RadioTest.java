package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void findCurrentStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        int actual = cond.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    void findCurrentStation2() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int actual = cond.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void findCurrentStation3() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int actual = cond.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void NextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(8);
        cond.setNextStation();

        int actual = cond.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void NextStation2() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.setNextStation();

        int actual = cond.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void PrevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(1);
        cond.setPrevStation();

        int actual = cond.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void PrevStation2() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.setPrevStation();

        int actual = cond.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);

    }
    @Test
    void findCurrentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(5);

        int actual = cond.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    void findCurrentVolume2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void findCurrentVolume3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    void increaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);
        cond.setIncreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    void increaseVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.setIncreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);
        cond.setDecreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setDecreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

}