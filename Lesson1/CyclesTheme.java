public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
         int counter = -10;
        int evenSum = 0;
        int notEvenSum = 0;
        do {
            if (counter % 2 == 0) {
                evenSum = evenSum + counter;
            } else {
                notEvenSum = notEvenSum + counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum
                + " а нечетных = " + notEvenSum);

        System.out.println("\n2.Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int maxValiue = 0;
        if (a > b && a > c) {
            maxValiue = a;
        } else if (b > a && b > c) {
            maxValiue = b;
        } else {
            maxValiue = c;
        }
        int minValue = 0;
        if (a < b && a < c) {
            minValue = a;
        } else if (b < a && b < c) {
            minValue = b;;
        } else {
            minValue = c;
        }
        for (int i = maxValiue; i > minValue; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int multiplier = 1;
        int startNum = 1234;
        int num1 = 0;
        int Sum = 0;
        while (multiplier <= 1000) {
            num1 = (startNum / multiplier) % 10;
            System.out.print(num1);
            multiplier = multiplier * 10;
            Sum = Sum + num1;
        }
        System.out.print("\n" + Sum);

        System.out.println("\n\n4.Вывод чисел в несколько строк");
        int scorer = 0;
        int start = 1;
        int end = 32;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                scorer++;
                if (scorer > 4) {
                    System.out.println();
                    scorer = 0;
                }
            }
        }
        for (int i = 5 - scorer; i > 0; i--) {
            if (scorer > 0) {
                System.out.printf("%3d", 0);
            } else {
                break;
            }
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность");
        int initialNum = 3242592;
        int n = initialNum;
        int totalTwo = 0;
        int residual = 0;
        while (n != 0) {
            residual = n % 10;
            if (residual == 2) {
                totalTwo = totalTwo + 1;
            }
            n = n / 10;
        }
        if (totalTwo % 2 == 0) {
            System.out.println("В " + initialNum + " четное количество двоек — " + totalTwo);
        } else {
            System.out.println("В " + initialNum + " нечетное количество двоек — " + totalTwo);
        }

        System.out.println("\n6.Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++)
                System.out.print("#");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 3; ++i) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; ++i) {
            for (int j = i; j < 2; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%-10s %-10s %-10s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        char item = '\u000F';
        for (int i = item; i < 123; i++) {
            item = (char) i;
            String description = Character.getName(item);
            if (i < 48 && i % 2 != 0) {
                System.out.printf("  %-13d%-7c%-6s\n", (int) item, item, description);
            }
            if (i > 97 && i % 2 == 0) {
                System.out.printf("  %-13d%-7c%-6s\n", (int) item, item, description);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int someNumber = 1234321;
        int palindrome = someNumber;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (someNumber == reverse) {
            System.out.println("число " + someNumber + " является палиндромом");
        } else {
            System.out.println("число " + someNumber + " не является палиндромом");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        int luckyNumber = 354444;
        int number = luckyNumber;
        int firstHalf = 0;
        int secondHalf = 0;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            if (number > 100) {
                secondHalf = secondHalf * 10 + remainder;
                secondHalfSum = secondHalfSum + remainder;

            } else {
                firstHalf = firstHalf * 10 + remainder;
                firstHalfSum = firstHalfSum + remainder;
            }
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + luckyNumber + " является счастливым\n" +
                    "Сумма цифр " + firstHalf + " = " + firstHalfSum + ", а сумма "
                    + secondHalf + " = " + secondHalfSum);
        } else {
            System.out.println("Число " + luckyNumber + " не является счастливым\n" +
                    "Сумма цифр " + firstHalf + " = " + firstHalfSum + ", а сумма "
                    + secondHalf + " = " + secondHalfSum);
        }

        System.out.println("\n10.Отображение таблицы умножения Пифагора");
        System.out.printf("      %-8s%-10s\n", "ТАБЛИЦА", "ПИФАГОРА");
        for (int i = 1; i < 10; i++) {
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