import java.util.StringTokenizer;

public class StringUtils {
    public static String removeSpaces(String string) {
        return string.replaceAll(Character.toString(Constants.SPACE), View.NULL_STRING);
    }

    public static boolean isStringDigit(String string) {
        if (string.length() == 0) return false;
        boolean haveAnyOtherSymbols = false;
        for (int i = 0; i < string.length(); i++)
            if ((string.charAt(i) < Constants.NUMBER_OF_ZERO || string.charAt(i) > Constants.NUMBER_OF_NINE)
                    && string.charAt(i) != Constants.SPACE)
                haveAnyOtherSymbols = true;
        if (haveAnyOtherSymbols) return false;

        StringTokenizer stringTokenizer = new StringTokenizer(string);
        if(stringTokenizer.countTokens() > 1) return false;

        string = removeSpaces(string);
        if (string.equals("0")) return true;
        if (string.length() > Constants.MAX_INT_VALUE_LENGTH - 1) return false;
        if (string.charAt(0) == Constants.NUMBER_OF_ZERO) return false;
        return true;
    }
}
