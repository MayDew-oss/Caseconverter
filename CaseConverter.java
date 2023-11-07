import java.util.Locale;

public class CaseConverter {
    public static String toUpperCase(String input) {
        return input.toUpperCase(Locale.getDefault());
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase(Locale.getDefault());
    }

    public static String toTitleCase(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s");
        for (String word : words) {
            if (word.length() > 0) {
                result.append(word.substring(0, 1).toUpperCase(Locale.getDefault()));
                result.append(word.substring(1).toLowerCase(Locale.getDefault()));
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
