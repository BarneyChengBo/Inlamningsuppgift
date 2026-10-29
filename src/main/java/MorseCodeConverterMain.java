import java.util.Scanner;

public class MorseCodeConverterMain {
    public static void main(String[] args) {
        MorseCodeConverter morseCodeConverter = new MorseCodeConverter();
        Scanner scan = new Scanner(System.in);
        int indexOfWay;
        boolean keepRun = true;

        System.out.println("Press 1 or 2 to select translate way:");
        System.out.println("1. Translate Morse code to English letters.");
        System.out.println("2. Translate English letters to Morse code.");
        System.out.println();

        indexOfWay = Integer.parseInt(scan.nextLine());


        while(keepRun) {

            if (indexOfWay == 1) {
                System.out.println("Please write the Morse code:");
                String inputText = scan.nextLine();
                String result = morseCodeConverter.getConverterMtoE(inputText);
                System.out.println(result);
                keepRun = false;
            } else if (indexOfWay == 2) {
                System.out.println("Please write the English letters:");
                String inputText = scan.nextLine();
                String result = morseCodeConverter.getConverterEtoM(inputText);
                System.out.println(result);
                keepRun = false;
            } else {
                System.out.println("Pick one from 1 or 2:");
                indexOfWay = Integer.parseInt(scan.nextLine());
            }
        }



    }
}
