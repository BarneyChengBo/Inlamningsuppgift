import java.util.Scanner;

public class MorseCodeConverterMain {
    public static void main(String[] args) {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();
        String result = morseCodeConverter.getConverterEtoM(inputText);
        System.out.println(result);
    }
}
