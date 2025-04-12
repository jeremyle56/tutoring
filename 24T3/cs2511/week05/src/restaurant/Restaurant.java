package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.StandardStrategy;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public double cost(List<Meal> order, String payee) {
        return chargingStrategy.cost(order, members.contains(payee));

        // switch (chargingStrategy) {
        // case "standard":
        // return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        // case "holiday":
        // return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
        // case "happyHour":
        // if (members.contains(payee)) {
        // return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        // } else {
        // return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        // }
        // case "discount":
        // if (members.contains(payee)) {
        // return order.stream().mapToDouble(meal -> meal.getCost() * 0.85).sum();
        // } else {
        // return order.stream().mapToDouble(meal -> meal.getCost()).sum();
        // }
        // default:
        // return 0;
        // }
    }

    public void displayMenu() {
        double modifier = chargingStrategy.standardChargeModifier();

        // switch (chargingStrategy) {
        // case "standard":
        // modifier = 1;
        // break;
        // case "holiday":
        // modifier = 1.15;
        // break;
        // case "happyHour":
        // modifier = 0.7;
        // break;
        // case "discount":
        // modifier = 1;
        // break;
        // }

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public void setCharingStrategy(ChargingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
    }

}