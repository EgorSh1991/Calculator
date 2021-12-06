import java.io.IOException;

public final class InputOutput {

    public static void inOut(String firstString, String operator, String secondString) throws IOException {
        int first = 0;
        int second = 0;
        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
            System.out.println(Operations.operations(first, operator, second));
        } catch (Exception exception) {
            try {
                first = Converter.toDecimal(firstString);
                second = Converter.toDecimal(secondString);
                System.out.println(Converter.toRoman(Operations.operations(first, operator, second)));
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
        }
    }
}

