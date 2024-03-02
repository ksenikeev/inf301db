package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.Spending;
import ru.itis.inf301.db.repository.SpendingRepository;

import java.util.ArrayList;
import java.util.List;

public class WorkWithSpending implements SpendingService{

    private Spending spendings;
    private SpendingRepository repository;

    public WorkWithSpending(SpendingRepository repository){
        spendings = repository.load();
        this.repository = repository;
    }

    public Spending getSpending() {
        return spendings;
    }

    public void updateFile(){
        repository.save(spendings);
    }

    public void addSpending(String date, Float sum, int categoryCode, String description) {

    }


    public List<RecordData> getSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }


    public Float getSumSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }
}
