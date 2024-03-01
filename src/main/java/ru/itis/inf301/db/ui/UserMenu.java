package ru.itis.inf301.db.ui;

import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.IncomeCategory;
import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.service.IncomeService;
import ru.itis.inf301.db.service.SpendingService;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDateTime.now;

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
    private void addIncome() {
        String date = now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        float sum;
        while (true){
            sum = scanner.nextFloat();
            if (sum > 0.0) break;
            System.out.print("Ошибка! Введите положительное значение: ");
        }
        System.out.println("Выберите категорию:\n" +
                           "1. Зарплата\n" +
                           "2. Стипендия\n" +
                           "3. Пособие\n" +
                           "4. Денежный перевод");
        int choice;
        while (true){
            choice = scanner.nextInt();
            if (choice > 0 && choice < 5) break;
            System.out.print("Некорретный выбор! Выберите существующую категорию: ");
            System.out.println();
        }
        System.out.println("Введите описание дохода: ");
        String description = scanner.nextLine();

        incomeService.addIncome(date, sum, choice, description);
    };
    // Ахмадуллина
    private void addSpending() {};
}
