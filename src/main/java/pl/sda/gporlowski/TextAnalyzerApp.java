package pl.sda.gporlowski;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class TextAnalyzerApp {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Map<Character, List<String>> characterListMap = groupWordsByFirstCharacter(text);
        System.out.println(characterListMap);
    }

    private static Map<Character, List<String>> groupWordsByFirstCharacter (String textToAnalyze) {
        Map<Character, List<String>> characterStringMap = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char letter : alphabet) {
            characterStringMap.put(letter, new ArrayList<>());
        }

        textToAnalyze = textToAnalyze.replace(",", "").replace(".", "").toLowerCase();
        String[] arrOfString = textToAnalyze.split(" ");

        for (String s : arrOfString) {
            char j = s.charAt(0);
            List<String> list = characterStringMap.get(j);
            list.add(s);
            characterStringMap.put(j,list);
        }
        return characterStringMap;
    }
}
