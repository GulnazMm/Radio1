import domain.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void station() {
        radio.setCurrentStation(3);
        int actual = radio.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseStation() {
        radio.setCurrentStation(5);
        radio.increaseStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(10, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void amountStation() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void volume() {
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}




