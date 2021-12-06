import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Вас приветствует калькулятор." +
                "\nВводите пример только арабскими цифрами(от 1 до 10), либо только римскими цифрами(от I до X)." +
                "\nПример вводится в одну строку с пробелами.");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            String []data = read.readLine().split(" ");
            InputOutput.inOut(data[0], data[1], data[2]);
        } catch (Exception e1) {
            System.out.println("Ошибка. Пожалуйста прочитайте условия внимательно.");
        }
    }
}


