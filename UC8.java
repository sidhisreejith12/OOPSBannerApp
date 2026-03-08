import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {
        
        Map<Character, String[]> charMap = createCharacterPatternMap();

        
        String message = "OOPS";

        
        printMessage(message, charMap);
    }

    
    public static Map<Character, String[]> createCharacterPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        });

        map.put('P', new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });

        map.put('S', new String[]{
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        });

        map.put(' ', new String[]{
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        });

        return map;
    }

    
    public static void printMessage(String message, Map<Character, String[]> charMap) {
        int lines = 7; // Each character has 7 lines
        for (int i = 0; i < lines; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[i]);
                sb.append("  "); // Space between characters
            }
            System.out.println(sb.toString());
        }
    }
}