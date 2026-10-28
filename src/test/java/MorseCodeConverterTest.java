import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeConverterTest {

    @Test
    void convertSingleLetter() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  ".-";
        String actualCode = morseCodeConverter.getConverterEtoM("A");
        assertEquals(expectedCode,actualCode);
    }

}
