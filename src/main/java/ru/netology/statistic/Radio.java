package ru.netology.statistic;

public class Radio {
    private int minStation;
    private int maxStation = 10 - 1;
    private int currentStation = maxStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume = maxVolume;

    public int getMinStation() { return minStation; }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
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

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        System.out.println("Radio initialized with min station " + minStation + " and max station " + maxStation);
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        System.out.println("Radio initialized with min volume " + minVolume + " and max volume " + maxVolume);
    }

    public Radio(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation - 1;
        System.out.println("Radio initialized with min station " + minStation + " and max station " + maxStation);
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        System.out.println("Radio initialized with min volume " + minVolume + " and max volume " + maxVolume);
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

