package ru.itis.inf301.db.repository;

import ru.itis.inf301.db.model.Spending;

/** Работа с JSON файлами */
public interface SpendingRepository {
    //Солодянкин
    Spending load();
    //Камалов
    void save(Spending spending);
}
