public class UC6 {

    public static void main(String[] args) {
        
        String[] banner = new String[7];
        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

       
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", O1[i], O2[i], P[i], S[i]);
        }

        
        for (String line : banner) {
            System.out.println(line);
        }
    }

    
    static String[] getO() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    
    static String[] getP() {
        return new String[] {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    
    static String[] getS() {
        return new String[] {
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        };
    }
}