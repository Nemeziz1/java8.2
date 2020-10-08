package ru.netology.domain;

public class Radio {
    private int currentRadiostation;
    private int firstRadiostation;
    private int lastRadiostation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        this.currentRadiostation = currentRadiostation;
    }

    public int getFirstRadiostation() {
        return firstRadiostation;
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

    public void nextStation(int currentRadiostation) {
        if (currentRadiostation >= lastRadiostation)
            this.currentRadiostation = firstRadiostation;
        this.currentRadiostation = currentRadiostation + 1;
    }

    public void prevStation(int currentRadiostation) {
        if (currentRadiostation <= firstRadiostation)
            this.currentRadiostation = lastRadiostation;
        this.currentRadiostation = currentRadiostation - 1;
    }

    public void plusVolume(int currentVolume) {
        if (currentVolume >= maxVolume)
            return;
        this.currentVolume = currentVolume + 1;
    }

    public void minusVolume(int currentVolume) {
        if (currentVolume <= minVolume)
            return;
        this.currentVolume = currentVolume - 1;
    }
}
