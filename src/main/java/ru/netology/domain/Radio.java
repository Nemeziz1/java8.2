package ru.netology.domain;

public class Radio {
    private int numberOfStations = 15;
    private int currentRadiostation = 10;
    private int firstRadiostation = 0;
    private int lastRadiostation = 14;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfStations, int currentRadiostation, int firstRadiostation, int lastRadiostation) {
        this.numberOfStations = numberOfStations;
        this.currentRadiostation = currentRadiostation;
        this.firstRadiostation = firstRadiostation;
        this.lastRadiostation = lastRadiostation;
    }

    public Radio(int currentVolume, int maxVolume, int minVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getFirstRadiostation() {
        return firstRadiostation;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setFirstRadiostation(int firstRadiostation) {
        this.firstRadiostation = firstRadiostation;
    }

    public int getLastRadiostation() {
        return lastRadiostation;
    }

    public void setLastRadiostation(int lastRadiostation) {
        this.lastRadiostation = lastRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        this.currentRadiostation = currentRadiostation;
    }

    public void nextStation() {
        if (currentRadiostation >= lastRadiostation) {
            this.currentRadiostation = firstRadiostation;
            return;
        }
        this.currentRadiostation = currentRadiostation + 1;
    }

    public void prevStation() {
        if (currentRadiostation <= firstRadiostation) {
            this.currentRadiostation = lastRadiostation;
            return;
        }
        this.currentRadiostation = currentRadiostation - 1;
    }

    public void plusVolume() {
        if (currentVolume >= maxVolume)
            return;
        this.currentVolume = currentVolume + 1;
    }

    public void minusVolume() {
        if (currentVolume <= minVolume)
            return;
        this.currentVolume = currentVolume - 1;
    }
}
