package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.RecordData;

import java.util.List;

public class SpendingServiceR implements SpendingService {
    @Override
    public Income getSpending() {
        return null;
    }

    @Override
    public void addSpending(String date, Float sum, int categoryCode, String description) {

    }

    @Override
    public List<RecordData> getSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }

    @Override
    public Float getSumSpendingByPeriod(String dateFrom, String DateTo) {
        try {
            Float sum = 0F;
            List<RecordData> spendings = getSpendingByPeriod(dateFrom, DateTo);
            for (RecordData spending : spendings) {
                sum += spending.getSum();
            }
            return sum;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
