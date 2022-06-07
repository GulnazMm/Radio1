import domain.Radio;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
            void max(){
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int actual = radio.getCurrentStationNumber();
        int expected = 0;
    }

    @Test
    void switch(){
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int actual = radio.getCurrentStationNumber();
        int expected = 0;
    }
}
