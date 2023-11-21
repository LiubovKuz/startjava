public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String sex1 = "male";
        String sex2 = "fimale";
        String sex = sex1;
        if (sex == sex1) {
            System.out.println("Перед вами мужчина");
        } else {
            System.out.println("Перед вами женщина");
        }
        int age1 = 15;
        int age2 = 19;
        int age = age2;
        if (age > 18) {
            System.out.println("Теперь можно всё!");
        } else {
            System.out.println("Извините вам еще нет 18!");
        }
        double height1 = 2.1;
        double height2 = 1.7;
        double height = height2;
        if (height < 1.8) {
            System.out.println("Можно стать космонавтом");
        } else {
            System.out.println("Выберите другую профессию");
        }
        
        System.out.println("\n2. Поиск большего числа");
        int a = 3;
        int b = 30;
        if (a > b ) {
            System.out.println("Число a больше");
        } else if (b > a) {
            System.out.println("Число b больше");
        } else if (a == b ){
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int c = -15;
        if (c == 0 ) {
            System.out.println(c + " Является нулём");
        } else if (c > 0 && (c % 2) == 0){
            System.out.println(a + " Является положительным и четным");
        } else if (c > 0 && (c % 2) != 0){
            System.out.println(a + " Является положительным и нечетным");
        } else if (c < 0 && (c % 2) == 0){
            System.out.println(a + " Является отрицательным и четным");
        } else if (c < 0 && (c % 2) != 0){
            System.out.println(c + " Является отрицательным и нечетным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int d = 123;
        int e = 223;
        if ((d / 1) % 10 == (e / 1) % 10) {
            System.out.println("Исходные числа " + d + " " + e);
            System.out.println("Одинаковое число " + ((d / 1) % 10));
            System.out.println("разряд единицы");
        }
        if ((d / 10) % 10 == (e / 10) % 10) {
            System.out.println("Исходные числа " + d + " " + e);
            System.out.println("Одинаковое число " + ((d / 10) % 10));
            System.out.println("разряд десятки");
        }
        if ((d / 100) % 10 == (e / 100) % 10) {
            System.out.println("Исходные числа " + d + " " + e);
            System.out.println("Одинаковое число " + ((d / 100) % 10));
            System.out.println("разряд сотни");
        }
        if (((d / 1) % 10 != (e / 1) % 10) && ((d / 10) % 10 != (e / 10) % 10)
                && (d / 100) % 10 != (e / 100) % 10) {
            System.out.println("Одинаковых чисел нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char charVar = '\u0031';
        if (charVar == 'A' || charVar == 'B' || charVar == 'C' || charVar == 'D' || charVar == 'E' ||
                charVar == 'F' || charVar == 'G' || charVar == 'H' || charVar == 'J' || charVar == 'K' ||
                charVar == 'L' || charVar == 'M' || charVar == 'N' || charVar == 'O' || charVar == 'P'
                || charVar == 'Q' || charVar == 'R' || charVar == 'S' || charVar == 'T' || charVar == 'U' ||
                charVar == 'W' || charVar == 'X' || charVar == 'Y' || charVar == 'Z') {
            System.out.println("Символ " + charVar + " является большой буквой");
        } else if (charVar == 'a' || charVar == 'b' || charVar == 'c' || charVar == 'd' || charVar == 'e' ||
                charVar == 'f' || charVar == 'g' || charVar == 'h' || charVar == 'j' || charVar == 'k' ||
                charVar == 'l' || charVar == 'm' || charVar == 'n' || charVar == 'o' || charVar == 'p'
                || charVar == 'q' || charVar == 'r' || charVar == 's' || charVar == 't' || charVar == 'u' ||
                charVar == 'w' || charVar == 'x' || charVar == 'y' || charVar == 'z') {
            System.out.println("Символ " + charVar + " является маленькой буквой");
        } else if (charVar == '0' || charVar == '1' || charVar == '2' || charVar == '3' || charVar == '4' ||
                charVar == '5' || charVar == '6' || charVar == '7' || charVar == '8' || charVar == '9') {
            System.out.println("Символ " + charVar + " является цифрой");
        } else {
            System.out.println("Символ " + charVar + " является не буквой и не цифрой");}

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 70000;
        if (deposit <= 100_000) {
            System.out.println("Сумма вклада - " + deposit);
            System.out.println("Сумма начисленного % - " + (deposit * 5 / 100));
            System.out.println("Итоговая сумма с % - " + (deposit +((deposit * 5)/100)));
        } else if (deposit > 100_000 && deposit <= 300_000) {
            System.out.println("Сумма вклада - " + deposit);
            System.out.println("Сумма начисленного % - " + (deposit * 7 / 100));
            System.out.println("Итоговая сумма с % - " + (deposit + (deposit * 7 / 100)));
        } else if (deposit > 300_000) {
            System.out.println("Сумма вклада - " + deposit);
            System.out.println("Сумма начисленного % - " + (deposit * 10 / 100));
            System.out.println("Итоговая сумма с % - " + (deposit + (deposit * 10 / 100)));
        }
        
        System.out.println("\n7. Определение оценки по предметам");
        int scoreHistory = 59;
        int gradeHistory;
        int scoreProgramming = 92;
        int gradeProgramming;
        if (scoreHistory <= 60) {
            gradeHistory = 2;
        } else if (scoreHistory > 60 && scoreHistory <= 73){
            gradeHistory = 3;
        } else if (scoreHistory > 73 && scoreHistory <= 91){
            gradeHistory = 4;
        } else {
            gradeHistory = 5;
        }
        if (scoreProgramming <= 60) {
            gradeProgramming = 2;
        } else if (scoreProgramming > 60 && scoreProgramming <= 73){
            gradeProgramming = 3;
        } else if (scoreProgramming > 73 && scoreProgramming <= 91){
            gradeProgramming = 4;
        } else {
            gradeProgramming = 5;
        }
        System.out.println("История " + gradeHistory);
        System.out.println("Программирование " + gradeProgramming);
        System.out.println("Средний бал оценок = " + (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний % по предметам = " + (scoreHistory + scoreProgramming) / 2);

        System.out.println("\n8.Расчет годовой прибыли");
        int monthlySales = 13000;
        int monthlyRent = 5000;
        int monthlyNetCost = 9000;
        int yearProfit = (monthlySales * 12) - (monthlyRent * 12) - (monthlyNetCost *12);
        char plus = '+';
        char minus = '-';
        if (yearProfit < 0) {
            System.out.println("Прибыль за год: " + yearProfit + " рублей");
        } else if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + plus + yearProfit + " рублей");
        } else {System.out.println("Прибыль за год: " + 0 + " рублей");
        }
    }
}