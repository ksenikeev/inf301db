package ru.itis.inf301.db.model;

public enum SpendingCategory {
    /** Магазин */
    Market(1),
    /** Транспортные расходы */
    Transport(2),
    /** Услуги */
    Service(3),
    /** Развлечения */
    Fun(4),
    /** Расходы по ЖКХ */
    Communal(5);

    int code;

    SpendingCategory(int code) {
        this.code = code;
    }

    int getCode() {
        return  code;
    }

    SpendingCategory findByCode(int code) {
        return null;
    }
}
