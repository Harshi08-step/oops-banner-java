import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Inner class
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> map = new HashMap<>();

        // Add O
        map.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        // Add P
        map.put('P', new CharacterPattern('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        }));

        // Add S
        map.put('S', new CharacterPattern('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        }));

        String word = "OOPS";

        // Print banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch).getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}
