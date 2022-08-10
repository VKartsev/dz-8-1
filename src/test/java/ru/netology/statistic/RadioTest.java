package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldCreateDefaultRadio() {
        assertEquals(9, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void shouldCreateCustomRadio() {
        Radio radio = new Radio(20);
        assertEquals(19, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void findCurrentStation() {
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findCurrentStation2() {
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findCurrentStation3() {
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findCurrentStation4() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        int actual = radio.getCurrentStation();
        int expected = 19;
        assertEquals(expected, actual);
    }

    @Test
    void findMaxStation() {
        int actual = radio.getMaxStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findMaxStation2() {
        Radio radio = new Radio(30);
        int actual = radio.getMaxStation();
        int expected = 29;
        assertEquals(expected, actual);
    }

    @Test
    void NextStation() {
        radio.setCurrentStation(8);
        radio.setNextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void NextStation2() {
        radio.setCurrentStation(9);
        radio.setNextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void NextStation3() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.setNextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void PrevStation() {
        radio.setCurrentStation(1);
        radio.setPrevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void PrevStation2() {
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void PrevStation3() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int actual = radio.getCurrentStation();
        int expected = 29;

        assertEquals(expected, actual);
    }
    @Test
    void findCurrentVolume() {
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void findCurrentVolume2() {
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(9);
        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume2() {
        radio.setCurrentVolume(100);
        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(1);
        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume2() {
        radio.setCurrentVolume(0);
        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }
}