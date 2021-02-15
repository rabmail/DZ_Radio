package ru.netology.constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int maxStation = 10;  //для информации
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentStation;

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
    // добавить громкость
    public void NextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else currentVolume = maxVolume;

    }
    // убавить громкость
    public void PreviousVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }


}

