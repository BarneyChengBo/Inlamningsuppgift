import java.util.ArrayList;
import java.util.HashMap;

public class MorseCodeConverter {

    private HashMap<String, String> codeDictionaryEtoM = new HashMap<>();
    private HashMap<String, String> codeDictionaryMtoE = new HashMap<>();

    public MorseCodeConverter() {
        codeDictionaryEtoM.put("A", ".-");
        codeDictionaryEtoM.put("B", "-...");
        codeDictionaryEtoM.put("C", "-.-.");
        codeDictionaryEtoM.put("D", "-..");
        codeDictionaryEtoM.put("E", ".");
        codeDictionaryEtoM.put("F", "..-.");
        codeDictionaryEtoM.put("G", "--.");
        codeDictionaryEtoM.put("H", "....");
        codeDictionaryEtoM.put("I", "..");
        codeDictionaryEtoM.put("J", ".---");
        codeDictionaryEtoM.put("K", "-.-");
        codeDictionaryEtoM.put("L", ".-..");
        codeDictionaryEtoM.put("M", "--");
        codeDictionaryEtoM.put("N", "-.");
        codeDictionaryEtoM.put("O", "---");
        codeDictionaryEtoM.put("P", ".--.");
        codeDictionaryEtoM.put("Q", "--.-");
        codeDictionaryEtoM.put("R", ".-.");
        codeDictionaryEtoM.put("S", "...");
        codeDictionaryEtoM.put("T", "-");
        codeDictionaryEtoM.put("U", "..-");
        codeDictionaryEtoM.put("V", "...-");
        codeDictionaryEtoM.put("W", ".--");
        codeDictionaryEtoM.put("X", "-..-");
        codeDictionaryEtoM.put("Y", "-.--");
        codeDictionaryEtoM.put("Z", "--..");
        codeDictionaryEtoM.put(" ", "");

        char letter = 'A';

        for (int i = 0; i < 26; i++) {
            String letterStr = String.valueOf((char) (letter + i));
            codeDictionaryMtoE.put(codeDictionaryEtoM.get(letterStr), letterStr);
        }

    }

    public String getConverterEtoM(String content) {
        char[] contentCharArray = content.toCharArray();
        ArrayList<String> saveList = new ArrayList<String>();

        for (int i = 0; i < contentCharArray.length; i++) {
            if (contentCharArray[i] != ' ') {
                String singleChar = String.valueOf(contentCharArray[i]);
                String charStrM = codeDictionaryEtoM.get(singleChar);
                saveList.add(charStrM);
            }

        }

        return String.join(" ", saveList);
    }

    public String getConverterMtoE(String content) {
        String[] morseWords = content.split(" ");
        ArrayList<String> saveList = new ArrayList<String>();

        for (int i = 0; i < morseWords.length; i++) {
            String charStrE = codeDictionaryMtoE.get(morseWords[i]);
            saveList.add(charStrE);
        }

        return String.join("", saveList);
    }


}
