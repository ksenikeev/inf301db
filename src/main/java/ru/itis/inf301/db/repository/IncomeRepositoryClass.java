package ru.itis.inf301.db.repository;

import ru.itis.inf301.db.model.Income;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class IncomeRepositoryClass implements IncomeRepository{

    @Override
    public Income load() {
        ObjectMapper mapper = new ObjectMapper();
        Income income;
        try {
            income = mapper.readValue(new File("income.json"), Income.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return income;
    }

    @Override
    public void save(Income income) {
    }
}
