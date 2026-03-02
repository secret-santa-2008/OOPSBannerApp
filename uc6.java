public class uc6 {

    // Method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    // Method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        // Get patterns
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build and print banner line by line
        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }
}