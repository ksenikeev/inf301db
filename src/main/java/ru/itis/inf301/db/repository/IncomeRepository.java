package ru.itis.inf301.db.repository;

import ru.itis.inf301.db.model.Income;

/** Работа с JSON файлами */
public interface IncomeRepository {
    // Сикачев
    Income load();
    // Мартиросян
    void save(Income income);
}
