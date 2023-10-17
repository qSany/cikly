public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int year = 1904; year < 2096; year = year + 4) {

            System.out.println(year + "год является високосным.");
        }
        System.out.println("Задача 6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int deposit = 29000;
        int monthlyDeposit = 0;
        for (int month = 1; month <= 12; month++) {
            monthlyDeposit = deposit + monthlyDeposit;
            System.out.println("Месяц " + month + "Сумма накоплений равна" + monthlyDeposit + "рублей");
        }
        System.out.println("Задача 9");
        for (int month = 1; month <= 12; month++) {
            deposit += (deposit * 0.12) / 12;

                System.out.println("Месяц " + month + "Сумма накоплений равна" + deposit + "рублей");

        }
            System.out.println("Задача 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 x " + i + " = " + 2 * i);
            }
        }
    }

