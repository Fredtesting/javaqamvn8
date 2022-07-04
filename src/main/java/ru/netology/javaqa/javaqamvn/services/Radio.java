
package ru.netology.javaqa.javaqamvn.services;
public class Radio {

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
