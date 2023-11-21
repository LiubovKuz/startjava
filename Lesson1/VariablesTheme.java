public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");

        /*объявите переменные всех существующих в Java 
        примитивных типов данных, присвоив им значения*/
        byte cores = 4;
        System.out.println("Количество ядер = " + cores);

        short threads = 8;
        System.out.println("Количество потоков = " + threads);

        int tdp = 15;
        System.out.println("Энергопотребление(W) = " + tdp);

        long dSize = 917;
        System.out.println("Объем диска Д (Гбт) = " + dSize);

        float boostFrequency = 3.4f;
        System.out.println("Максимальная частота (ГГц) = " + boostFrequency);

        double frequency = 1.6;
        System.out.println("Частота (ГГц) = " + cores);

        char cpu = 'i';
        System.out.println("Имя процессора = " + cpu);

        boolean isNotebookWork = true;
        System.out.println("Ноутбук в рабочем состоянии? = " + isNotebookWork);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int penCost = 100;
        int bookCost = 200;
        int sum = penCost + bookCost;
        double discount = (sum * 11) / 100;
        System.out.println("общая стоимость товаров без скидки = " + sum);
        System.out.println("сумма скидки = " + discount);
        System.out.println("общая стоимость товаров со скидкой = " + (sum - discount));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteVariable = 127;
        System.out.println("byte значение " + byteVariable);
        byteVariable++;
        System.out.println("byte min = " + byteVariable);
        byteVariable--;
        System.out.println("byte max = " + byteVariable);

        short shortVariable = 32767;
        System.out.println("short значение = " + shortVariable);
        shortVariable++;
        System.out.println("short min = " + shortVariable);
        shortVariable--;
        System.out.println("short max = " + shortVariable);

        int intVariable = 2147483647;
        System.out.println("int значение = " + intVariable);
        intVariable++;
        System.out.println("int min значение = " + intVariable);
        intVariable--;
        System.out.println("int max значение = " + intVariable);

        long longVariable = 9223372036854775807L;
        System.out.println("long значение = " + longVariable);
        longVariable++;
        System.out.println("long min значение = " + longVariable);
        longVariable--;
        System.out.println("long max значение = " + longVariable);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Замена значений переменных с помощью третьей переменной");
        System.out.println("Исходные значения a = " + a + " b = "+ b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Новые значения a = " + a + " b = "+ b);

        System.out.println("Замена значений переменных с помощью арифметических операций");
        System.out.println("Исходные значения a = " + a + " b = "+ b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения a = " + a + " b = "+ b);

        System.out.println("Замена значений переменных с помощью побитовой операции");
        System.out.println("Исходные значения a = " + a + " b = "+ b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения a = " + a + " b = "+ b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println("ASCII value of " + dollar + " is " + (int)dollar);

        char asterisk = '*';
        System.out.println("ASCII value of " + asterisk + " is " + (int)asterisk);

        char atSign = '@';
        System.out.println("ASCII value of " + atSign + " is " + (int)atSign);

        char verticalBar = '|';
        System.out.println("ASCII value of " + verticalBar + " is " + (int)verticalBar);

        char tilde = '~';
        System.out.println("ASCII value of " + tilde + " is " + (int)tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + leftParenthesis + " " 
            + rightParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + slash 
            + backslash + underscore + underscore + underscore + backslash);
        
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int units = number % 10;
        int decimals = (number / 10) % 10;
        int hundreds = number / 100;
        System.out.println("Число N содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + decimals);
        System.out.println("единиц - " + units);
        System.out.println("Сумма его цифр = " + (units + decimals + hundreds));
        System.out.println("Произведение = " + (units * decimals * hundreds));

        System.out.println("\n9. Вывод времени");
        int time = 86399;
        int ss = time % 60;
        int mm = (time / 60) % 60;
        int hh = time / (60*60);
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}