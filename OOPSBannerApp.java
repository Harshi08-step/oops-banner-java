import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized pattern storage
    static Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        patternMap.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}
