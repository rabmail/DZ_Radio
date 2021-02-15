package ru.netology.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //установить  радиостанцию с пульта
    @Test
    public void setCurrentStation() {
        Radio radio = new Radio(10, 0, 100, 0, 0, 6);
        assertEquals(6, radio.getCurrentStation());
    }

    //если максимальная станция переходим на минимальную
    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio(10, 0, 100, 0, 0, 11);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

    }

    //если минимальная станция на максимальную
    @Test
    public void setCurrentStationMin() {
        Radio radio = new Radio(10, 0, 100, 0, 0, 0);
        radio.setCurrentStation(-1);
        assertEquals(10, radio.getCurrentStation());

    }

    //следующая радиостанция
    @Test
    public void nextStation() {
        Radio radio = new Radio(10, 0, 100, 0, 0, 7);
        radio.NextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    //предыдущая радиостанция
    @Test
    public void previousStation() {
        Radio radio = new Radio(10, 0, 100, 0, 0, 7);
        radio.PreviousStation();
        assertEquals(6, radio.getCurrentStation());
    }

    //установить  громкость с пульта
    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio(10, 0, 100, 0, 49, 0);
        assertEquals(49, radio.getCurrentVolume());

    }

    //если громкость максимальная нечего не делаем при увеличении
    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio(10, 0, 100, 0, 100, 0);
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());

    }

    //если громкость минимальная нечего не делаем при уменьщении
    @Test
    public void setCurrentVolumeMin() {
        Radio radio = new Radio(10, 0, 100, 0, 0, 0);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

    }

    // увеличиваем громкость
    @Test
    public void nextVolume() {
        Radio radio = new Radio(10, 0, 100, 0, 49, 0);
        radio.NextVolume();
        assertEquals(50, radio.getCurrentVolume());
    }

    //уменьшаем громкость
    @Test
    public void previousVolume() {
        Radio radio = new Radio(10, 0, 100, 0, 49, 0);
        radio.PreviousVolume();
        assertEquals(48, radio.getCurrentVolume());
    }


}