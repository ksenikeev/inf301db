package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.repository.IncomeRepository;

import java.util.ArrayList;
import java.util.List;

public class IncomeService implements IIncomeService {

    private IncomeRepository repository;
    private static Income income;

    public IncomeService() {
        income = new Income();
    }

    @Override
    public Income getIncome() {
        return null;
    }

    @Override
    public void addIncome(String date, Float sum, int categoryCode, String description) {

    }

    @Override
    public List<RecordData> getIncomeByPeriod(String dateFrom, String DateTo) {
        return null;
    }

    @Override
    public Float getSumIncomeByPeriod(String dateFrom, String DateTo) {
        return null;
    }
}
