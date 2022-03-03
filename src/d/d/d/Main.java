package d.d.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество строк:");
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        String [] str = new String[count];

        Scanner line = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            str[i] = line.nextLine();
        }

    }
}