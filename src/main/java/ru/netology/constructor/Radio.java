package ru.netology.constructor;

public class Radio {

    private int maxStation = 10;  //для информации
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentStation;


    public Radio(int maxStation,
                 int minStation,
                 int maxVolume,
                 int minVolume,
                 int currentVolume,
                 int currentStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;
    }

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

    //установить  громкость с пульта
    public int getCurrentVolume() {
        return currentVolume;
    }

    //если громкость максимальная нечего не делаем при увеличении
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            return;
        }
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    //установить  радиостанцию с пульта
    public int getCurrentStation() {
        return currentStation;
    }

    // если переход по станциям
    public void setCurrentStation(int currentStation) {
        if (currentStation <= minStation) {
            currentStation = 10;
        } else if (currentStation >= maxStation) {
            currentStation = 0;

        }
        this.currentStation = currentStation;

    }

    //следующая радиостанция
    public void NextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else currentStation = minStation;
    }

    //предыдущая радиостанция
    public void PreviousStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else currentStation = maxStation;
    }

    public void NextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else currentVolume = maxVolume;

    }

    public void PreviousVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }


}

