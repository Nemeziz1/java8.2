package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextStation() {
        Radio radio = new Radio(15, 9, 0, 14);
        radio.nextStation();
        assertEquals(10, radio.getCurrentRadiostation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(14, 2, 0, 13);
        radio.prevStation();
        assertEquals(1, radio.getCurrentRadiostation());
    }

    @Test
    public void nextStationOutside() {
        Radio radio = new Radio(10, 9, 0, 9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void prevStationOutside() {
        Radio radio = new Radio(8,1, 1, 8);
        radio.prevStation();
        assertEquals(8, radio.getCurrentRadiostation());
    }

    @Test
    public void plus() {
        Radio radio = new Radio(95, 100, 0);
        radio.plusVolume();
        assertEquals(96, radio.getCurrentVolume());
    }

    @Test
    public void plusOutside() {
        Radio radio = new Radio(100,100,0);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void minus() {
        Radio radio = new Radio(26,100,0);
        radio.minusVolume();
        assertEquals(25, radio.getCurrentVolume());
    }

    @Test
    public void minusOutside() {
        Radio radio = new Radio(0,100,0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}