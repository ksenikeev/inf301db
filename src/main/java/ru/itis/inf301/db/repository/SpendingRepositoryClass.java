package ru.itis.inf301.db.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.Spending;

import java.io.File;
import java.io.IOException;

public class SpendingRepositoryClass implements SpendingRepository {

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Spending load() {
        return null;
    }

    @Override
    public void save(Spending spending) {
        try {
            objectMapper.writeValue(new File("spending.json"), spending);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
