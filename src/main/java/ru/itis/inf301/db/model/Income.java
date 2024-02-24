package ru.itis.inf301.db.model;

import java.util.List;

public class Income {
    private List<RecordData> income;

    public List<RecordData> getIncome() {
        return income;
    }

    public void setIncome(List<RecordData> income) {
        this.income = income;
    }
}
