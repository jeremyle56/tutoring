package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {
    private final double HOLIDAY_RATE = 1.15;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * HOLIDAY_RATE).sum();
    }

    @Override
    public double standardChargeModifier() {
        return HOLIDAY_RATE;
    }
}
