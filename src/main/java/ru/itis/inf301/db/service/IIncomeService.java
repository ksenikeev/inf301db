package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.repository.IncomeRepository;

import java.util.List;

public interface IIncomeService {



    Income getIncome();

    //Батуллина
    void addIncome(String date, Float sum, int categoryCode, String description);

    //Абзалов
    List<RecordData> getIncomeByPeriod(String dateFrom, String DateTo);
    //Салямов
    Float getSumIncomeByPeriod(String dateFrom, String DateTo);
}
