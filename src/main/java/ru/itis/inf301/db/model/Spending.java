package ru.itis.inf301.db.model;

import java.util.List;

public class Spending {
    private List<RecordData> spending;

    public List<RecordData> getSpending() {
        return spending;
    }

    public void setSpending(List<RecordData> spending) {
        this.spending = spending;
    }
}
