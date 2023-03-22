import java.util.Scanner;

public class JavaTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = new String();
        int size = 0, s = 0;
        System.out.println("Введите количество элементов в массиве ");
        in = input.nextLine();
        try {
            size = Integer.parseInt(in);
        } catch (Exception e) {
            System.out.println("Вы не ввели целое число!");
            System.exit(0);
        }
        Integer[] arrayOfInt = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент под номером " + (i + 1));
            in = input.nextLine();
            try {
                arrayOfInt[i] = Integer.parseInt(in);
            } catch (Exception e) {
                System.out.println("Вы не ввели целое число!");
                System.exit(0);
            }
            s += arrayOfInt[i];
        }
        System.out.println("Сумма всех чисел в массиве: " + s);
        System.out.println("Среднее арифметическое: " + (double) s/size);
    }
}
