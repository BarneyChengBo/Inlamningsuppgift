import java.util.Scanner;

public class MorseCodeConverterMain {
    public static void main(String[] args) {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        Scanner scan = new Scanner(System.in);
        int indexOfWay;


        System.out.println("Press 1 or 2 to select translate way:");
        System.out.println("1. Translate Morse code to English letters.");
        System.out.println("2. Translate English letters to Morse code.");

        while(true) {
            try {
                indexOfWay = Integer.parseInt(scan.nextLine());
                if (indexOfWay == 1 || indexOfWay == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice, Please pick 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("We need number only");
            }

        }

        if (indexOfWay == 1) {
            System.out.println("Please write the Morse code:");
            String inputText = scan.nextLine();
            String result = morseCodeConverter.getConverterMtoE(inputText);
            System.out.println(result);
        } else {
            System.out.println("Please write the English letters:");
            String inputText = scan.nextLine();
            String result = morseCodeConverter.getConverterEtoM(inputText);
            System.out.println(result);

        }

    }
}
