package ru.netology;

public class Radio {

    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int currentStation;
    private boolean radioOff;  //хотел посмотреть работу boolean



    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public int getCurrentStation() {
        return currentStation;
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

    public void NextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else currentStation = minStation;
    }

    public void NextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else currentVolume = maxVolume;

    }

    public void PreviousStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else currentStation = maxStation;
    }

    public void PreviousVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public boolean RadioOff() {
        return radioOff;
    }

    public void RadioOff(boolean radioOff) {
        this.radioOff = radioOff;
    }
}

