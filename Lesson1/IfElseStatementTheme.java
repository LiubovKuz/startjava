public class IfElseStatementTheme {
    public static void main(String[] args) {
      System.out.println("1. Перевод псевдокода на язык Java");
        String sex = "male";
        if (sex == "male") {
            System.out.println("Перед вами мужчина");
        } else {
            System.out.println("Перед вами женщина");
        }
        int age = 15;
        if (age > 18) {
            System.out.println("Теперь можно всё!");
        } else {
            System.out.println("Извините вам еще нет 18!");
        }
        double height = 2.1;
        if (height < 1.8) {
            System.out.println("Можно стать космонавтом");
        } else {
            System.out.println("Выберите другую профессию");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 3;
        int b = 30;
        if (a > b) {
            System.out.println("Число a больше");
        } else if (b > a) {
            System.out.println("Число b больше");
        } else if (a == b) {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int c = 15;
        String even = "нечетным";
        if (c == 0) {
            System.out.println("Число равно 0");
        } else {
            if (c % 2 == 0) {
                even = "четным";
            }
            if (c > 0) {
                System.out.print(c + " Является положительным и " + even);
            } else {
                System.out.print(c + " Является отрицательным и " + even);
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int a1 = 123;
        int b1 = 223;
        int aOnes = a1 % 10;
        int bOnes = b1 % 10;
        int aDecimals = (a1 / 10) % 10;
        int bDecimals = (b1 / 10) % 10;
        int aHundreds = (a1 / 100) % 10;
        int bHundreds = (b1 / 100) % 10;
        if (aOnes != bOnes && aDecimals != bDecimals && aHundreds != bHundreds) {
            System.out.println("Одинаковых чисел нет");
        } else {
            if (aOnes == bOnes) {
                System.out.println("Одинаковое число " + aOnes);
                System.out.println("разряд единицы");
            }
            if (aDecimals == bDecimals) {
                System.out.println("Одинаковое число " + aDecimals);
                System.out.println("разряд десятки");
            }
            if (aHundreds == bHundreds) {
                System.out.println("Одинаковое число " + aHundreds);
                System.out.println("разряд сотни");
            }
            System.out.println("Исходные числа " + a1 + " " + b1);
        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u005E';
        if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("Символ " + someChar + " является большой буквой");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("Символ " + someChar + " является маленькой буквой");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("Символ " + someChar + " является цифрой");
        } else {
            System.out.println("Символ " + someChar + " является не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 70000;
        int rate = 5;
        int interest = (deposit * rate) / 100;
        if (deposit > 100_000 && deposit <= 300_000) {
            rate = 7;
        } else if (deposit > 300_000) {
            rate = 10;
        }
        System.out.println("Сумма вклада - " + deposit);
        System.out.println("Сумма начисленного % - " + interest);
        System.out.println("Итоговая сумма с % - " + (deposit + interest));
        
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 75;
        int historyGrade = 2;
        if (historyPercent >= 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        
        int programmingPercent = 92;
        int programmingGrade = 2;
        if (programmingPercent >= 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println("История " + historyGrade);
        System.out.println("Программирование " + programmingGrade);
        System.out.println("Средний бал оценок = " + (double) (historyGrade + programmingGrade) / 2);
        System.out.println("Средний % по предметам = " + (double) (historyPercent + programmingPercent) / 2);
   

        System.out.println("\n8.Расчет годовой прибыли");
        int monthlySales = 13000;
        int monthlyRent = 5000;
        int monthlyNetCost = 9000;
        int yearProfit = (monthlySales - monthlyRent - monthlyNetCost) * 12;
        if (yearProfit <= 0) {
            System.out.println("Прибыль за год: " + yearProfit + " рублей");
        } else {
            System.out.println("Прибыль за год: +" + yearProfit + " рублей");
        }
    }
}