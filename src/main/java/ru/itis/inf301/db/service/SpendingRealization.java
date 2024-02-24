package ru.itis.inf301.db.service;

import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.Spending;
import ru.itis.inf301.db.model.SpendingCategory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SpendingRealization implements SpendingService{

    @Override
    public Spending getSpending() {
        return null;
    }

    @Override
    public void addSpending(String date, Float sum, int categoryCode, String description) {
        List<RecordData> list = getSpending().getSpending();
        Date newData;
        try {
             newData = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                    .parse(date);
        } catch (ParseException e) {
            System.out.println("Неправильная дата");
            return;
        }
        RecordData recordData = new RecordData();
        recordData.setDate(newData);
        SpendingCategory category = SpendingCategory.values()[categoryCode-1];
        recordData.setCategory(category);
        recordData.setDescription(description);
        recordData.setSum(sum);
        list.add(recordData);
    }

    @Override
    public List<RecordData> getSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }

    @Override
    public Float getSumSpendingByPeriod(String dateFrom, String DateTo) {
        return null;
    }
}
