package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        currentStation = getCurrentStation();
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        return;
    }

    public void setPrevStation() {
        currentStation = getCurrentStation();
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
        return;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {
        currentVolume = getCurrentVolume();
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return;
        }
        if (currentVolume >= 10) {
            currentVolume = currentVolume;
        }
        return;

    }

    public void setDecreaseVolume() {
        currentVolume = getCurrentVolume();
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
        if (currentVolume <= 0) {
            currentVolume = currentVolume;
        }
        return;
    }
}
