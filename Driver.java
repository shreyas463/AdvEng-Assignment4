package Q2;

import factory.*;
import meal.*;
import Customer;

public class Driver {
    public static void main(String[] args) {
        MacronutrientAbstractFactory abstractFactory = MacronutrientAbstractFactory.getInstance();
        MacronutrientMealFactory mealFactory = new MacronutrientMealFactory(abstractFactory);


        Customer customer1 = new Customer("Shreyas", "No Restriction");
        Customer customer3 = new Customer("Vijit", "Vegan");
        Customer customer5 = new Customer("Pikachu", "Vegan");
        Customer customer2 = new Customer("Rooney", "Paleo");
        Customer customer6 = new Customer("Snorlax", "Paleo");
        Customer customer4 = new Customer("Messi", "Nut Allergy");




        MacronutrientMeal meal1 = mealFactory.createMeal(customer1);
        MacronutrientMeal meal2 = mealFactory.createMeal(customer2);
        MacronutrientMeal meal3 = mealFactory.createMeal(customer3);
        MacronutrientMeal meal4 = mealFactory.createMeal(customer4);
        MacronutrientMeal meal5 = mealFactory.createMeal(customer5);
        MacronutrientMeal meal6 = mealFactory.createMeal(customer6);

        // Printing the generated meals
        System.out.println(customer1.getName() + ": your " + customer1.getDietPlan()+ " has the following items " + meal1);
        System.out.println(customer2.getName() + ": your " + customer2.getDietPlan()+ " has the following items " + meal2);
        System.out.println(customer3.getName() + ": your " + customer3.getDietPlan()+ " has the following items " + meal3);
        System.out.println(customer4.getName() + ": your " + customer4.getDietPlan()+ " has the following items " + meal4);
        System.out.println(customer5.getName() + ": your " + customer5.getDietPlan()+ " has the following items " + meal5);
        System.out.println(customer6.getName() + ": your " + customer6.getDietPlan()+ " has the following items " + meal6);
    }
}

