import java.util.ArrayList;
import java.util.HashMap;

public class MorseCodeConverter {

    private HashMap<String, String> codeDictionaryEtoM = new HashMap<>();
    //HashMap<String, String> codeDictionaryMtoE = new HashMap<>();

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
    }

    public String getConverterEtoM(String content) {
        char[] contentCharArray = content.toCharArray();
        ArrayList<String> saveList = new ArrayList<String>();

        for (int i = 0; i < contentCharArray.length; i++) {
            if (contentCharArray[i] != ' '){
                String singelChar = String.valueOf(contentCharArray[i]);
                String charStr = codeDictionaryEtoM.get(singelChar);
                saveList.add(charStr);
            }

        }

        return String.join(" ", saveList);
    }


}
