package ru.itis.inf301.db.model;

import java.util.Date;

public class RecordData {
    private Date date;
    private Float sum;
    private SpendingCategory category;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    public SpendingCategory getCategory() {
        return category;
    }

    public void setCategory(SpendingCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
