import domain.Radio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void station() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void next() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void lessZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxCondition() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void lessMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void stationLessNormal() {
        Radio radio = new Radio();
        radio.setCurrentStation(-4);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void stationBelowNormal() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationAboveNormal() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeAboveNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeLessNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void extremeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void volumeAboveZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void aboveNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void belowNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

}





