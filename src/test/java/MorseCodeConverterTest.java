import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeConverterTest {

    @Test
    void convertSingleLetterMtoE() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  ".-";
        String actualCode = morseCodeConverter.getConverterEtoM("A");
        assertEquals(expectedCode,actualCode);
    }

    @Test
    void convertSingleLetterEtoM() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  "A";
        String actualCode = morseCodeConverter.getConverterMtoE(".-");
        assertEquals(expectedCode,actualCode);
    }

    @Test
    void convertSingleWordMtoE() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  "-- .. -. . -.-. .-. .- ..-. -";
        String actualCode = morseCodeConverter.getConverterEtoM("MINECRAFT");
        assertEquals(expectedCode,actualCode);
    }

    @Test
    void convertSingleWordEtoM() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  "JELLYFISH";
        String actualCode = morseCodeConverter.getConverterMtoE(".--- . .-.. .-.. -.-- ..-. .. ... ....");
        assertEquals(expectedCode,actualCode);
    }

    @Test
    void convertSpaceDividedWordsMtoE() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  ".... . - ..- .-. -. ... --- ..-. ..-. - .... . .-.. .. --. .... -";
        String actualCode = morseCodeConverter.getConverterEtoM("HE TURNS OFF THE LIGHT");
        assertEquals(expectedCode,actualCode);
    }

    @Test
    void convertSpaceDividedWordsEtoM() {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        String expectedCode =  "YOUCANSEEEVERYTHING";
        String actualCode = morseCodeConverter.getConverterMtoE("-.-- --- ..- -.-. .- -. ... . . . ...- . .-. -.-- - .... .. -. --.");
        assertEquals(expectedCode,actualCode);
    }


}
