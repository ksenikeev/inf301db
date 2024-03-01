/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.itis.inf301.db.service;

import java.util.List;
import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.IncomeCategory;
import ru.itis.inf301.db.model.RecordData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
/**
 *
 * @author ekaterina
 */
public class IncomeRealization implements IncomeService {

    @Override
    public Income getIncome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addIncome(String date, Float sum, int categoryCode, String description) {
        
        List<RecordData> list = getIncome().getIncome();
        Date data;
        try {
            data = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(date);
        } catch (ParseException e) {
            System.out.println("Некорректное значение даты");
            return;
        }
        RecordData recordData = new RecordData();
        recordData.setDate(data);
        IncomeCategory category = IncomeCategory.values()[categoryCode-1];
        recordData.setCategory(category);
        recordData.setDescription(description);
        recordData.setSum(sum);
        list.add(recordData);
        
    }

    @Override
    public List<RecordData> getIncomeByPeriod(String dateFrom, String DateTo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Float getSumIncomeByPeriod(String dateFrom, String DateTo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
