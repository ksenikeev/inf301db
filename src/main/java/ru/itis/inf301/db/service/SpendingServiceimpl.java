package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.Spending;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
        List<RecordData> spending = new ArrayList<>();
        LocalDate from = LocalDate.parse(dateFrom);
        LocalDate to = LocalDate.parse(DateTo);
        Date from1 = java.sql.Date.valueOf(from);
        Date to1 = java.sql.Date.valueOf(to);
        for(RecordData rd: getSpending().getSpending()){
            if (rd.getDate().compareTo(from1) >= 0 && rd.getDate().compareTo(to1)<=0){
                spending.add(rd);
            }
        }
        return spending;
    }

    @Override
    public Float getSumSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }
}
