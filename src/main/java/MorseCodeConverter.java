import java.util.HashMap;

public class MorseCodeConverter {

    private HashMap<String, String> codeDictionary = new HashMap<>();


    public MorseCodeConverter() {
        codeDictionary.put("A", ".-");
        codeDictionary.put("B", "-...");
        codeDictionary.put("C", "-.-.");
        codeDictionary.put("D", "-..");
        codeDictionary.put("E", ".");
        codeDictionary.put("F", "..-.");
        codeDictionary.put("G", "--.");
        codeDictionary.put("H", "....");
        codeDictionary.put("I", "..");
        codeDictionary.put("J", ".---");
        codeDictionary.put("K", "-.-");
        codeDictionary.put("L", ".-..");
        codeDictionary.put("M", "--");
        codeDictionary.put("N", "-.");
        codeDictionary.put("O", "---");
        codeDictionary.put("P", ".--.");
        codeDictionary.put("Q", "--.-");
        codeDictionary.put("R", ".-.");
        codeDictionary.put("S", "...");
        codeDictionary.put("T", "-");
        codeDictionary.put("U", "..-");
        codeDictionary.put("V", "...-");
        codeDictionary.put("W", ".--");
        codeDictionary.put("X", "-..-");
        codeDictionary.put("Y", "-.--");
        codeDictionary.put("Z", "--..");
        codeDictionary.put(" ", "");

        char letter = 'A';

        for (int i = 0; i < 26; i++) {
            String letterStr = String.valueOf((char) (letter + i));
            codeDictionary.put(codeDictionary.get(letterStr), letterStr);
        }

    }

    public String getConverterEtoM(String content) {
        char[] contentCharArray = content.toCharArray();
        String myText = "";

        for (int i = 0; i < contentCharArray.length; i++) {
            if (contentCharArray[i] != ' ') {
                myText += codeDictionary.get(String.valueOf(contentCharArray[i])) + " ";
            }
        }

        return myText.trim();
    }

    public String getConverterMtoE(String content) {
        String[] morseWords = content.split(" ");
        String myText = "";

        for (int i = 0; i < morseWords.length; i++) {
            myText += codeDictionary.get(morseWords[i]);
        }

        return myText.trim();
    }


}
