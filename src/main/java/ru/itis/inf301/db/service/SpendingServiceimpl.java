package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.Spending;

import java.util.List;

public class SpendingServiceimpl implements SpendingService{
    @Override
    public Spending getSpending() {
        return null;
    }

    @Override
    public void addSpending(String date, Float sum, int categoryCode, String description) {

    }

    @Override
    public List<RecordData> getSpendingByPeriod(String dateFrom, String DateTo) {
        /*Spending spending<RecordData> = getSpending()<>;
        for(RecordData rd: spending){

        }*/
        return null;
    }

    @Override
    public Float getSumSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }
}
