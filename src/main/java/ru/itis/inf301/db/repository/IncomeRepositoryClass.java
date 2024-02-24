package ru.itis.inf301.db.repository;
import ru.itis.inf301.db.model.Income;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
public class IncomeRepositoryClass implements IncomeRepository{

    @Override
    public Income load() {
        return null;
    }

    @Override
    public void save(Income income) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("income.json"), income);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
