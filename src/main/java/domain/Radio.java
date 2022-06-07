package domain;

public class Radio {

    public int currentStationNumber;
    public int volume;

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void next() {
        int currentStation;
        if (currentStation >= 9) {
            currentStation = 0;
            if (currentStation < 9) {
                currentStation = currentStation + 1;
            }
        }
    }
}
