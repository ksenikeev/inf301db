package ru.itis.inf301.db.ui;

import ru.itis.inf301.db.service.IncomeService;
import ru.itis.inf301.db.service.SpendingService;
import ru.itis.inf301.db.model.RecordData;

import java.util.List;
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
    private void showAllIncomeSum() {
        List<RecordData> allIncome= incomeService.getIncome().getIncome();
        long summAllIncome = 0;
        for (int i = 0; i < allIncome.size(); i++){
            summAllIncome += allIncome.get(i).getSum();
        }
        System.out.println(summAllIncome);
    };
    // Кашапов
    private void showAllSpendingSum() {};
    // Снигирев
    private void addIncome() {};
    // Ахмадуллина
    private void addSpending() {};
}
