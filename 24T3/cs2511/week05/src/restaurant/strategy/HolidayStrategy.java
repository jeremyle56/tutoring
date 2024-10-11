package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {
    private final double HOLIDAY_CHARGE = 1.15;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * HOLIDAY_CHARGE).sum();
    }

    @Override
    public double standardChargeModifier() {
        return HOLIDAY_CHARGE;
    }
}
