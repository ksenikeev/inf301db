package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.Spending;
import ru.itis.inf301.db.repository.SpendingRepository;

import java.util.ArrayList;
import java.util.List;

public class WorkWithSpending implements SpendingService{

    private Spending spendings;

    public WorkWithSpending(){
        spendings = new Spending();
    }

    public WorkWithSpending(RecordData record){
        this();
        List<RecordData> list = new ArrayList<>();
        list.add(record);
        spendings.setSpending(list);
    }

    public WorkWithSpending(SpendingRepository repository){
        spendings = repository.load();
    }

    public Spending getSpending() {
        return spendings;
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
