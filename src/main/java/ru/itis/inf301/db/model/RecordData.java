package ru.itis.inf301.db.model;

import java.util.Date;

public class RecordData {
    private Date date;
    private Float sum;
    private IncomeCategory category;
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

    public IncomeCategory getCategory() {
        return category;
    }

    public void setCategory(IncomeCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Date: " + date + "\n" +
                "Category: " + category + "\n" +
                "Sum: " + String.format("%.2f", sum) + " rub" + "\n" +
                "Description: " + description + "\n";
    }
}
