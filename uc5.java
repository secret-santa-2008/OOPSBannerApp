public class uc5 {

    public static void main(String[] args) {

        // Declare and initialize array in single statement
        String[] banner = {

                // O
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** "),
                "",

                // O
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** "),
                "",

                // P
                String.join("", "****** "),
                String.join("", "*     *"),
                String.join("", "****** "),
                String.join("", "*      "),
                String.join("", "*      "),
                "",

                // S
                String.join("", " ***** "),
                String.join("", "*      "),
                String.join("", " ***** "),
                String.join("", "      *"),
                String.join("", " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
