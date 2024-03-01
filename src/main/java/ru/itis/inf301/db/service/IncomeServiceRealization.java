package ru.itis.inf301.db.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis.inf301.db.model.Income;
import ru.itis.inf301.db.model.IncomeCategory;
import ru.itis.inf301.db.model.RecordData;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class IncomeServiceRealization implements IncomeService {

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Income getIncome() {
        return null;
    }

    @Override
    public void addIncome(String date, Float sum, int categoryCode, String description) {

    }

    // это писал Абзалов
    @Override
    public List<RecordData> getIncomeByPeriod(String dateFrom, String dateTo) throws IOException, ParseException {
        File file = new File("C:\\Users\\pc\\IdeaProjects\\inf301db\\src\\main\\java\\ru\\itis\\inf301\\db\\service\\test.json");
        Map<String, List<Map<String, Object>>> income = objectMapper.readValue(file, new TypeReference<>(){});
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<RecordData> list = new ArrayList<>();

        for (int i = 0; i < income.get("income").size(); i++) {
            String strDate = (String) income.get("income").get(i).get("date");
            Date startDate = df.parse(strDate);
            Date dateBefore = df.parse(dateFrom);
            Date dateAfter = df.parse(dateTo);
            if (startDate.after(dateBefore) && startDate.before(dateAfter)) {
                Double sum = (Double) income.get("income").get(i).get("sum");
                String category = (String) income.get("income").get(i).get("category");
                IncomeCategory cat = null;
                switch (category) {
                    case "зарплата":
                        cat = IncomeCategory.Salary;
                        break;
                    case "стипендия":
                        cat = IncomeCategory.Scholarship;
                        break;
                    case "пособие":
                        cat = IncomeCategory.Stipend;
                        break;
                    case "перевод":
                        cat = IncomeCategory.Transfer;
                        break;
                }
                String desc = (String) income.get("income").get(i).get("description");
                RecordData rd = new RecordData();
                rd.setCategory(cat);
                rd.setDate(startDate);
                rd.setDescription(desc);
                rd.setSum(sum.floatValue());

                list.add(rd);
            }
        }
        return list;
    }

    // это писал САЛЯМОВ
    @Override
    public Float getSumIncomeByPeriod(String dateFrom, String dateTo) throws ParseException, IOException {
        File file = new File("C:\\Users\\pc\\IdeaProjects\\inf301db\\src\\main\\java\\ru\\itis\\inf301\\db\\service\\test.json");
        Map<String, List<Map<String, Object>>> income = objectMapper.readValue(file, new TypeReference<>(){});
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Double sum = 0d;

        for (int i = 0; i < income.get("income").size(); i++) {
            String strDate = (String) income.get("income").get(i).get("date");
            Date startDate = df.parse(strDate);
            Date dateBefore = df.parse(dateFrom);
            Date dateAfter = df.parse(dateTo);
            if (startDate.after(dateBefore) && startDate.before(dateAfter)) {
                sum += (Double) income.get("income").get(i).get("sum");
            }
        }
        Float sum2 = sum.floatValue();
        return sum2;
    }
}