public final class Converter {

    private static int[] arabic = {100, 50, 40, 10, 9, 5, 4, 1};
    private static String[] roman = {"C", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String toRoman(int decimal) {
        StringBuilder romanNum = new StringBuilder();
        int value = decimal;
        for (int i = 0; i < arabic.length; i++) {
            while (value >= arabic[i]) {
                romanNum.append(roman[i]);
                value -= arabic[i];
            }
        }
        return romanNum.toString();
    }

    public static int toDecimal(String romeNumbers) {
        String rome = romeNumbers.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < arabic.length; i++) {
            while (rome.indexOf(roman[i]) == 0) {
                decimal += arabic[i];
                rome = rome.substring(roman[i].length());
            }
        }
        return decimal;
    }
}