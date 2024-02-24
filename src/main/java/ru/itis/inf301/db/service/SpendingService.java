package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.RecordData;

import java.util.List;

public interface SpendingService {

    Income getSpending();
    //Воропаев
    void addSpending(String date, Float sum, int categoryCode, String description);
    //Сафарова
    List<RecordData> getSpendingByPeriod(String dateFrom, String DateTo);
    //Галимзянов
    Float getSumSpendingByPeriod(String dateFrom, String DateTo);
}
