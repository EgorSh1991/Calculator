public final class Operations {

    public static int operations(int first, String operator, int second) {
        int result = 0;
        if (first < 1 || first > 10 || second < 1 || second > 10) {
            throw new IllegalArgumentException("Ошибка ввода число должно быть положительным");
        }
        switch (operator) {
            case "/":
                result = first / second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "+":
                result = first + second;
                break;
            default:
                throw new IllegalArgumentException("Вы ввели не верный арифметический оператор");
        }
        return result;
    }
}
