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
        byte byteMax = 127;
        System.out.println("byte значение " + byteMax);
        byteMax++;
        System.out.println("byte min = " + byteMax);
        byteMax--;
        System.out.println("byte max = " + byteMax);

        short shortMax = 32767;
        System.out.println("short значение = " + shortMax);
        shortMax++;
        System.out.println("short min = " + shortMax);
        shortMax--;
        System.out.println("short max = " + shortMax);

        int intMax = 2147483647;
        System.out.println("int значение = " + intMax);
        intMax++;
        System.out.println("int min значение = " + intMax);
        intMax--;
        System.out.println("int max значение = " + intMax);

        long longMax = 9223372036854775807L;
        System.out.println("long значение = " + longMax);
        longMax++;
        System.out.println("long min значение = " + longMax);
        longMax--;
        System.out.println("long max значение = " + longMax);

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
        System.out.println("ASCII value of " + dollar + " is " + (int) dollar);

        char asterisk = '*';
        System.out.println("ASCII value of " + asterisk + " is " + (int) asterisk);

        char atSign = '@';
        System.out.println("ASCII value of " + atSign + " is " + (int) atSign);

        char verticalBar = '|';
        System.out.println("ASCII value of " + verticalBar + " is " + (int) verticalBar);

        char tilde = '~';
        System.out.println("ASCII value of " + tilde + " is " + (int) tilde);

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
        int ones = number % 10;
        int decimals = (number / 10) % 10;
        int hundreds = number / 100;
        System.out.println("Число N содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + decimals);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + (ones + decimals + hundreds));
        System.out.println("Произведение = " + (ones * decimals * hundreds));

        System.out.println("\n9. Вывод времени");
        int time = 86399;
        int ss = time % 60;
        int mm = (time / 60) % 60;
        int hh = time / 3600;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}