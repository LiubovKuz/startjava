public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEven
                + ", а нечетных = " + sumOdd);

        System.out.println("\n2.Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = 10;
        int min = -1;
        if (a > b && a > c) {
            a = max;
        } else if (b > a && b > c) {
            b = max;
        } else c = max;
        if (a < b && a < c) {
            a = min;
        } else if (b < a && b < c) {
            b = min;
        } else c = min;

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int startNum = 1234;
        int sum = 0;
        while (startNum > 0) {
            int digit = startNum % 10;
            System.out.print(digit);
            startNum /= 10;
            sum += digit;
        }
        System.out.print("\n" + sum);

        System.out.println("\n\n4.Вывод чисел в несколько строк");
        counter = 0;
        int start = 1;
        int end = 32;
        for (int i = start; i < end; i += 2) {
            System.out.printf("%3d", i);
            counter++;
            if (counter > 4) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter > 0) {
            for (int i = 5 - counter; i > 0; i--) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность");
        startNum = 3242592;
        int copyStartNum = startNum;
        int countTwo = 0;
        int residual = 0;
        while (copyStartNum > 0) {
            residual = copyStartNum % 10;
            if (residual == 2) {
                countTwo++;
            }
            copyStartNum /= 10;
        }
        if (countTwo % 2 == 0) {
            System.out.println("В " + startNum + " четное количество двоек — " + countTwo);
        } else {
            System.out.println("В " + startNum + " нечетное количество двоек — " + countTwo);
        }

        System.out.println("\n6.Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int i = 5;
        while (i > 0) {
            int j = 1;
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println();
        i = 1;
        do {
            if (i <= 3) {
                int j = 1;
                do {
                    System.out.print("$");
                    j++;
                } while (j <= i);
                System.out.println();
                i++;
            } else {
                int j = i;
                do {
                    System.out.print("$");
                    j++;
                } while (j <= 5);
                System.out.println();
                i++;
            }
        } while (i <= 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%-10s %-11s %-10s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        char symbol = '\u000F';
        for (i = symbol; i < 123; i++) {
            symbol = (char) i;
            String description = Character.getName(symbol);
            if (i < 48 && i % 2 != 0) {
                System.out.printf("  %-13d%-13c%-6s\n", (int) symbol, symbol, description);
            }
            if (i > 97 && i % 2 == 0) {
                System.out.printf("  %-13d%-13c%-6s\n", (int) symbol, symbol, description);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        startNum = 1234321;
        copyStartNum = startNum;
        int reverse = 0;
        while (copyStartNum > 0) {
            int digit = copyStartNum % 10;
            reverse = reverse * 10 + digit;
            copyStartNum /= 10;
        }
        if (startNum == reverse) {
            System.out.println("число " + startNum + " является палиндромом");
        } else {
            System.out.println("число " + startNum + " не является палиндромом");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        int luckyNum = 354444;
        int copyLuckyNum = luckyNum;
        int firstHalf = 0;
        int secondHalf = 0;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        while (copyLuckyNum > 0) {
            int digit = copyLuckyNum % 10;
            copyLuckyNum /= 10;
            if (copyLuckyNum > 100) {
                secondHalf = secondHalf * 10 + digit;
                secondHalfSum = secondHalfSum + digit;

            } else {
                firstHalf = firstHalf * 10 + digit;
                firstHalfSum += digit;
            }
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + luckyNum + " является счастливым\n" +
                    "Сумма цифр " + firstHalf + " = " + firstHalfSum + ", а сумма "
                    + secondHalf + " = " + secondHalfSum);
        } else {
            System.out.println("Число " + luckyNum + " не является счастливым\n" +
                    "Сумма цифр " + firstHalf + " = " + firstHalfSum + ", а сумма "
                    + secondHalf + " = " + secondHalfSum);
        }

        System.out.println("\n10.Отображение таблицы умножения Пифагора");
        System.out.printf("      %-8s%-10s\n", "ТАБЛИЦА", "ПИФАГОРА");
        for (i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j < 2) {
                    System.out.printf("%-3d%-2s", i * j, "|");
                } else
                    System.out.printf("%-3d", i * j);
                if (i == 1 && j == 9) {
                    System.out.print("\n-----------------------------");
                }
            }
            System.out.print("\n");
        }
        
    }
}