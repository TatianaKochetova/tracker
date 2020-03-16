package calculator;
/**
 * Calculator.
 * @author Kochetova Tatiana (t.kochetova514@gmail.com)
 */
public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        /**
         * метод, выполняющий сложение
         */
        int onePlusTwo = one + two;
        /**
         * метод, выполняющий деление
         */
        int sixDivTwo = six / two;
        /**
         * метод, выполняющий вычитание
         */
        int fiveMinusTwo = five - two;
        /**
         * метод, выполняющий умножение
         */
        int fourTimeTwo = four *two;
        /**
         * вывод на консоль
         */
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
