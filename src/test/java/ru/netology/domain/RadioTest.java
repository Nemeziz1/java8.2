package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setFirstRadiostation(0);
        radio.setLastRadiostation(9);
        int currentRadiostation = 5;
        int expectedCurrentRadiostation = 6;
        radio.setCurrentRadiostation(currentRadiostation);
        radio.nextStation();
        assertEquals(expectedCurrentRadiostation, radio.getCurrentRadiostation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setFirstRadiostation(0);
        radio.setLastRadiostation(9);
        int currentRadiostation = 3;
        int expectedCurrentRadiostation = 2;
        radio.setCurrentRadiostation(currentRadiostation);
        radio.prevStation();
        assertEquals(expectedCurrentRadiostation, radio.getCurrentRadiostation());

    }

    @Test
    public void nextStationOutside() {
        Radio radio = new Radio();
        radio.setFirstRadiostation(0);
        radio.setLastRadiostation(9);
        int currentRadiostation = 9;
        int expectedCurrentRadiostation = 0;
        radio.setCurrentRadiostation(currentRadiostation);
        radio.nextStation();
        assertEquals(expectedCurrentRadiostation, radio.getCurrentRadiostation());
    }

    @Test
    public void prevStationOutside() {
        Radio radio = new Radio();
        radio.setFirstRadiostation(0);
        radio.setLastRadiostation(9);
        int currentRadiostation = 0;
        int expectedCurrentRadiostation = 9;
        radio.setCurrentRadiostation(currentRadiostation);
        radio.prevStation();
        assertEquals(expectedCurrentRadiostation, radio.getCurrentRadiostation());
    }

    @Test
    public void plus() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        int currentVolume = 7;
        int expectedCurrentVolume = 8;
        radio.setCurrentVolume(currentVolume);
        radio.plusVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @Test
    public void plusOutside() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        int currentVolume = 10;
        int expectedCurrentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.plusVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @Test
    public void minus() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        int currentVolume = 3;
        int expectedCurrentVolume = 2;
        radio.setCurrentVolume(currentVolume);
        radio.minusVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }

    @Test
    public void minusOutside() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        int currentVolume = 0;
        int expectedCurrentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.minusVolume();
        assertEquals(expectedCurrentVolume, radio.getCurrentVolume());
    }
}