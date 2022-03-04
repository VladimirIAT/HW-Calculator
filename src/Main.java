public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = (int) calc.plus.apply(1, 2);
        int b = (int) calc.minus.apply(1, 1);
        int c = (int) calc.divide.apply(a, b); //Ошибка возникает при b = 0

        calc.println.accept(c);
    }
}
