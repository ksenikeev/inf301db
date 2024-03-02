package ru.itis.inf301.db.ui;

import ru.itis.inf301.db.service.IncomeService;
import ru.itis.inf301.db.service.SpendingService;
import ru.itis.inf301.db.service.IncomeRealization;
import java.util.Scanner;

/**
 * 1. Показать все доходы
 * 2. Показать все расходы
 * 3. Показать все доходы за период
 * 4. Показать все расходы за период
 * 5. Показать баланс (доходы - расходы) за период
 * 6. Показать сумму доходов за период
 * 7. Показать сумму расходов за период
 * 8. Добавить позицию по доходам
 * 9. Добавить позицию по расходам
 */
public class UserMenu {

    private Scanner scanner;

    private IncomeService incomeService;
    private SpendingService spendingService;

    public UserMenu() {
        scanner = new Scanner(System.in);

        start();
    }

    private void start() {
        while (true) {

        }
    }

    // Баранов
    private void showAllIncome() {};
    // Фаварисова
    private void showAllSpending() {};
    //  Баранов
    private void showAllIncomeByPeriod() {};
    //  Фаварисова
    private void showAllByPeriod() {};
    // Гарифуллина
    private void showBalance() {};
    // Кузнецов
    private void showAllIncomeSum() {};
    // Кашапов
    private void showAllSpendingSum() {};
    // Снигирев
    private void addIncome() {};
    // Ахмадуллина
    private void addSpending() {
        System.out.println("set year: ");
        String date = "";
        while (true) {
            int d = scanner.nextInt();
            if (d >= 1000) {
                date += d + "-";
                break;
            }
        }
        System.out.println("month (in numerous format): ");
        while (true) {
            String d = scanner.next();
            if (Integer.parseInt(d) > 0 && Integer.parseInt(d) <= 12) {
                if (d.length() == 1) {
                    date += "0" + d + "-";
                }
                else {
                    date += d + "-";
                }
                break;
            }
        }
        System.out.println("day: ");
        while (true) {
            String d = scanner.next();
            if (Integer.parseInt(d) > 0 && Integer.parseInt(d) <= 31) {
                if (d.length() == 1) {
                    date += "0" + d + " ";
                }
                else {
                    date += d + " ";
                }
                break;
            }
        }
        System.out.println("hours: ");
        while (true) {
            String d = scanner.next();
            if (Integer.parseInt(d) > 0 && Integer.parseInt(d) <= 31) {
                if (d.length() == 1) {
                    date += "0" + d + ":";
                }
                else {
                    date += d + ":";
                }
                break;
            }
        }
        System.out.println("minutes: ");
        while (true) {
            String d = scanner.next();
            if (Integer.parseInt(d) > 0 && Integer.parseInt(d) <= 31) {
                if (d.length() == 1) {
                    date += "0" + d;
                }
                else {
                    date += d;
                }
                break;
            }
        }

        System.out.println("enter sum:");
        float sum = scanner.nextFloat();

        System.out.println("enter the code for your category: \nMarket - 1\nTransport - 2\nService - 3\nFun - 4\nCommunal - 5");
        int category = scanner.nextInt();

        System.out.println("add description:");
        String descr = scanner.nextLine();

        IncomeRealization incomeRealization = new IncomeRealization();
        incomeRealization.addIncome(date, sum, category, descr);
    };
}
