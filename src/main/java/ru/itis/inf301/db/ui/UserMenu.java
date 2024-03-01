package ru.itis.inf301.db.ui;

import ru.itis.inf301.db.service.IncomeService;
import ru.itis.inf301.db.service.SpendingService;

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

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //showAllIncome, showAllSpending, showAllIncomeByPeriod, showAllByPeriod, showBalance, showAllIncomeSum, showAllSpendingSum, addIncome, addSpending

    public void workWithSpending() {
        System.out.println("To look at:\nbalance - press 0\nall income - press 1\nall income by period - press 2\nall income sum - press 3\nadd income - press 4");
        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();
        switch (command) {
            case 0:
                showBalance();
                break;
            case 1:
                showAllIncome();
                break;
            case 2:
                showAllIncomeByPeriod();
                break;
            case 3:
                showAllIncomeSum();
                break;
            case 4:
                addIncome();
                break;
        }
    }

    public void workWithIncome() {
        System.out.println("To look at:\nbalance - press 0\nall spending - press 1\nall spending by period - press 2\nall spending sum - press 3\nadd spending - press 4");
        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();
        switch (command) {
            case 0:
                showBalance();
                break;
            case 1:
                showAllSpending();
                break;
            case 2:
                showAllByPeriod();
                break;
            case 3:
                showAllSpendingSum();
                break;
            case 4:
                addSpending();
                break;
        }
    }

    private void start() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello! What would you like to work with?\nIncome - press 1\nSpending - press 2\nexit - press 0");
            int command = sc.nextInt();
            switch (command) {
                case 0:
                    clearScreen();
                    break;
                case 1:
                    workWithIncome();
                    break;
                case 2:
                    workWithSpending();
                    break;
            }
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
    private void addSpending() {};
}