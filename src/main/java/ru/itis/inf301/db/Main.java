package ru.itis.inf301.db;

import ru.itis.inf301.db.model.IncomeCategory;
import ru.itis.inf301.db.model.RecordData;
import ru.itis.inf301.db.model.SpendingCategory;
import ru.itis.inf301.db.ui.UserMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // UserMenu userMenu = new UserMenu();
        RecordData inc = new RecordData();
        inc.setDate(new Date(1310192L));
        inc.setCategory(IncomeCategory.Salary);
        inc.setSum(27000.3456F);
        inc.setDescription("шары крутые");
        System.out.println(inc);

        RecordData sp = new RecordData();
        sp.setDate(new Date(189829182L));
        sp.setCategory(IncomeCategory.Transfer);
        sp.setSum(145F);
        sp.setDescription("шары крутецкие");
        System.out.println(sp);
    }
}
