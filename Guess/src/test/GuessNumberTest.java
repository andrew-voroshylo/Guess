import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class GuessNumberTest {

    Guess.GuessNumber guessNumber;

    @BeforeEach
    void setUp() {
        guessNumber = new Guess.GuessNumber();
    }

    @Test
    void getSetup(){
        assertEquals("0m", guessNumber.getSetup(), "okay");
    }

    @Test
    void getEnd(){
        assertEquals("8y", guessNumber.getEnd(), "okay");
    }

}