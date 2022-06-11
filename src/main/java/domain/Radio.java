package domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation > 0) {
            currentStation = currentStation + 1;
            if (currentStation >= 9) {
                currentStation = 0;
            }
            setCurrentStation(currentStation);
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
            else {
            currentStation = 9;
            }
            setCurrentStation(currentStation);
        }



    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }
}
