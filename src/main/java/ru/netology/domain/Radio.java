package ru.netology.domain;


public class Radio {
    public int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }

            if (newCurrentVolume > 10) {
                return;
            }
            currentVolume = newCurrentVolume;
        }

    public int getCurrentVolume () {

        return currentVolume;
    }

        public void increaseVolume () {
            if (currentVolume < 10) {
                currentVolume = currentVolume + 1;
            }
        }

    public void reductionVolume () {

        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
    }
    }
