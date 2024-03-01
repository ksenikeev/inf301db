package ru.itis.inf301.db.ui;

import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.service.IncomeService;
import ru.itis.inf301.db.service.SpendingService;

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
    private void showAllIncome() {
        List<RecordData> incomes  = incomeService.getIncome().getIncome();
        for (int i = 0; i < incomes.size(); i++) {
            RecordData inc = incomes.get(i);
            System.out.println("Date: " + inc.getDate()+ "\nSum: "+  inc.getSum()+"\nCategory: "+ inc.getCategory() + "\nDescription: " +  inc.getDescription());
        }
    };
    // Фаварисова
    private void showAllSpending() {};
    //  Баранов
    private void showAllIncomeByPeriod() {
        scanner = new Scanner(System.in);
        System.out.println("Введите начало периода по формату yyyy-MM-dd HH:mm:  ");
        String beg = scanner.nextLine();
        System.out.println("Введите конец периода по формату yyyy-MM-dd HH:mm:  ");
        String end = scanner.nextLine();
        List<RecordData> incomesByPeriod  = incomeService.getIncomeByPeriod(beg, end);
        for (int i = 0; i < incomesByPeriod.size(); i++) {
            RecordData inc = incomesByPeriod.get(i);
            System.out.println("Date: " + inc.getDate()+ "\nSum: "+  inc.getSum()+"\nCategory: "+ inc.getCategory() + "\nDescription: " +  inc.getDescription());
        }
    };
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
