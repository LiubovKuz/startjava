public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");

        //объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
        byte cores = 4;
        System.out.println("Колличество ядер = " + cores);

        short threads = 8;
        System.out.println("Колличество потоков = " + threads);

        int tdp = 15;
        System.out.println("Энэргопотребление(W) = " + tdp);

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

        int costOfPen = 100;
        int costOfBook = 200;
        double discount = ((costOfPen + costOfBook) * 11)/ 100;
        System.out.println("общая стоимость товаров без скидки = " + (costOfPen + costOfBook));
        System.out.println("сумма скидки = " + discount );
        System.out.println("общая стоимость товаров со скидкой = " 
        + ((costOfPen + costOfBook) - discount ));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte minByte = -128;
        System.out.println("byte min значение = " + minByte);
        minByte++;
        System.out.println("byte min значение + 1 = " + minByte);
        minByte--;
        System.out.println("byte min значение - 1 = " + minByte);
        byte maxByte = 127;
        System.out.println("byte max значение " + maxByte);
        maxByte++;
        System.out.println("byte max + 1 = " + maxByte);
        maxByte--;
        System.out.println("byte max - 1 = " + maxByte);

        short minShort = -32768;
        System.out.println("short min значение = " + minShort);
        minShort++;
        System.out.println("short min + 1 = " + minShort);
        minShort--;
        System.out.println("short min - 1 = " + minShort);
        short maxShort = 32767;
        System.out.println("short max значение = " + maxShort);
        maxShort++;
        System.out.println("short max + 1 = " + maxShort);
        maxShort--;
        System.out.println("short max - 1 = " + maxShort);

        int minInt = -2147483648;
        System.out.println("int min значение = " + minInt);
        minInt++;
        System.out.println("int min + 1 = " + minInt);
        minInt--;
        System.out.println("int min - 1 = " + minInt);
        int maxInt = 2147483647;
        System.out.println("int max значение = " + maxInt);
        maxInt++;
        System.out.println("int max значение + 1 = " + maxInt);
        maxInt--;
        System.out.println("int max значение - 1 = " + maxInt);

        long minLong = -9223372036854775808L;
        System.out.println("long min значение = " + minLong);
        minLong++;
        System.out.println("long min значение + 1 = " + minLong);
        minLong--;
        System.out.println("long min значение - 1 = " + minLong);
        long maxLong = 9223372036854775807L;
        System.out.println("long max значение = " + maxLong);
        maxLong++;
        System.out.println("long max значение + 1= " + maxLong);
        maxLong--;
        System.out.println("long max значение -1 = " + maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Замена значений переменных с помощью третьей переменной");
        System.out.println("Исходные значения a = " + a + " b = "+ b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения a = " + a + " b = "+ b);

        System.out.println("Замена значений переменных с помощью арифметических операций");
        System.out.println("Исходные значения a = " + a + " b = "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новые значения a = " + a + " b = "+ b);

        System.out.println("Замена значений переменных с помощью побитовой операции");
        System.out.println("Исходные значения a = " + a + " b = "+ b);
        a ^= b;
        b ^= a;
        System.out.println("Новые значения a = " + a + " b = "+ b);

        System.out.println("\n6. Вывод символов и их кодов");
        char code36 = '$';
        int as36 = code36;
        System.out.println(as36);
        System.out.println(code36);

        char code42 = '*';
        int as42 = code42;
        System.out.println(as42);
        System.out.println(code42);

        char code64 = '@';
        int as64 = code64;
        System.out.println(as64);
        System.out.println(code64);

        char code124 = '|';
        int as124 = code124;
        System.out.println(as124);
        System.out.println(code124);

        char code126 = '~';
        int as126 = code126;
        System.out.println(as126);
        System.out.println(code126);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char d1 = '/';
        char d2 = '\\';
        char d3 = '_';
        char d4 = '(';
        char d6 = ')';
        System.out.println("     " + d1 + d2 + "     ");
        System.out.println("    " + d1 + "  " + d2 + "    ");
        System.out.println("   " + d1 + d3 + d4 + " " + d6 + d2 + "   ");
        System.out.println("  " + d1 + "      " + d2 + "  ");
        System.out.println(" " + d1 + d3 + d3 + d3 + d1 + d2 + d3 + d3 + d3 + d2);
        
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int digit1 = (number / 1) % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        System.out.println("Число N содержит:");
        System.out.println("сотен - " + digit3);
        System.out.println("десятков - " + digit2);
        System.out.println("единиц - " + digit1);
        System.out.println("Сумма его цифр = " + digit1 + digit2 + digit3);
        System.out.println("Произведение = " + (digit1 * digit2 * digit3));

        System.out.println("\n9. Вывод времени");
        int time = 86399;
        int sec = (time / 1) % 60;
        int min = (time / 60) % 60;
        int hours = (time / (60*60)) % 60;
        System.out.println(hours + ":" + min + ":" + sec);

    }
}