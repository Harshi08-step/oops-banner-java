public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // OOPS → O O P S
        for (int i = 0; i < 7; i++) {
            System.out.println(
                o[i] + "  " +
                o[i] + "  " +
                p[i] + "  " +
                s[i]
            );
        }
    }

    // Method for O
    public static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method for P
    public static String[] getP() {
        return new String[] {
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        };
    }

    // Method for S
    public static String[] getS() {
        return new String[] {
            " *****",
            "*     ",
            "*     ",
            " *****",
            "      *",
            "      *",
            " *****"
        };
    }
}
