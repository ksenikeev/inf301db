package ru.itis.inf301.db.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis.inf301.db.model.Spending;

import java.io.File;
import java.io.IOException;

public class SpendingRepositoryClass implements SpendingRepository{
    @Override
    public Spending load() {
        ObjectMapper spend = new ObjectMapper();
        Spending spending;
        try {
            spending = spend.readValue(new File("spending.json"), Spending.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spending;
    }

    @Override
    public void save(Spending spending) {
    }

}
