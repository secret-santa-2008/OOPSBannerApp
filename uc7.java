public class uc7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character (O, P, S)
         * @param pattern the 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to create patterns

    public static String[] createOPattern() {
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

    public static String[] createPPattern() {
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

    public static String[] createSPattern() {
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

        // Create objects for each character
        CharacterPattern o1 = new CharacterPattern('O', createOPattern());
        CharacterPattern o2 = new CharacterPattern('O', createOPattern());
        CharacterPattern p = new CharacterPattern('P', createPPattern());
        CharacterPattern s = new CharacterPattern('S', createSPattern());

        // Store in array
        CharacterPattern[] patterns = {o1, o2, p, s};

        // Print banner using StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}