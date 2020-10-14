package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int numberOfStations = 15;
    private int currentRadiostation = 10;
    private int firstRadiostation = 0;
    private int lastRadiostation = 14;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


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
