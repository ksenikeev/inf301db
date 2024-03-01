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
    private void showAllIncome() {};
    // Фаварисова
    private void showAllSpending() {
        List<RecordData> allSpending = spendingService.getSpending().getSpending();
        for(RecordData rd: allSpending){
            System.out.println("Дата: " + rd.getDate() + ", сумма: " + rd.getSum()
                    + ", категория: " + rd.getCategory() +  ", описание: " + rd.getDescription());
        }
    };
    //  Баранов
    private void showAllIncomeByPeriod() {};
    //  Фаварисова
    private void showAllSpendingByPeriod() {
        scanner = new Scanner("Введите начало периода в формате 'yyyy-MM-dd HH:mm': ");
        String dateFrom = scanner.nextLine();
        scanner = new Scanner("Введите конец периода в формате 'yyyy-MM-dd HH:mm': ");
        String dateTo = scanner.nextLine();
        List<RecordData> SpendingByPeriod = spendingService.getSpendingByPeriod(dateFrom, dateTo);
        for(RecordData rd: SpendingByPeriod){
            System.out.println("Дата: " + rd.getDate() + ", сумма: " + rd.getSum()
                    + ", категория: " + rd.getCategory() +  ", описание: " + rd.getDescription());
        }
    };
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
