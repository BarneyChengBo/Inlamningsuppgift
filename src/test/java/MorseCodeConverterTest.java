import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeConverterTest {

    @Test
    void convertSingleLetterMtoA() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  ".-";
        String actualCode = morseCodeConverter.getConverterEtoM("A");
        assertEquals(expectedCode,actualCode);
    }

    @Test
    void convertSingleLetterAtoM() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  "A";
        String actualCode = morseCodeConverter.getConverterMtoE(".-");
        assertEquals(expectedCode,actualCode);
    }

}
