package state;

public interface State {

    // Бросить монетку
    void insertQuarter();

    // Вернуть монетку
    void ejectQuarter();

    // Дёрнуть рычаг
    void turnCrank();

    // Выдать шарик
    void dispense();

    default void refill() {

    }
}
