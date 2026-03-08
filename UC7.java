public class UC7 {

    public static void main(String[] args) {
        
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        
        String message = "OOPS";

        // Print the message as ASCII banner
        printMessage(message, charMaps);
    }

    
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[]{
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[]{
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        });

        return characterPatternMap;
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // Return space pattern if character not found
        return getCharacterPattern(' ', charMaps);
    }

    
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int lines = 7; // each character pattern has 7 lines
        for (int i = 0; i < lines; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[i]);
                sb.append("  "); // space between characters
            }
            System.out.println(sb.toString());
        }
    }
}