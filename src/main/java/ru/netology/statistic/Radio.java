package ru.netology.statistic;

public class Radio {
    private int minStation;
    private int maxStation;
    private int currentStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {
        this.maxStation = 10-1;
        this.currentStation = maxStation;
        this.currentVolume = maxVolume;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
        this.currentStation = maxStation;
        this.currentVolume = maxVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }
    public void setCurrentStation(int currentStation) {

        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setNextStation() {
        currentStation = getCurrentStation();
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;

        } else {
            currentStation = minStation;
        }
        return;
    }

    public void setPrevStation() {
        currentStation = getCurrentStation();
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
        return;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() { 
        currentVolume = getCurrentVolume();
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        }

    }
    public void setDecreaseVolume() { 
        currentVolume = getCurrentVolume();
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }
}

