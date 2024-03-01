package ru.itis.inf301.db.model;

public enum IncomeCategory{
    /** Зарплата */
    Salary(1),
    /** Стипендия */
    Scholarship(2),
    /** Пособие */
    Stipend(3),
    /** Денежный перевод */
    Transfer(4);

    int code;

    IncomeCategory(int code) {
        this.code = code;
    }

    int getCode() {
        return code;
    }

    IncomeCategory findByCode(int code) {
        return null;
    }
}
