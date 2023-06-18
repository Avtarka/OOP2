package ru.netology.OOP2;
public class Radio {
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
}
