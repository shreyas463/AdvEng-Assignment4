package Q1;

import java.util.List;

// Driver Main Class
public class PizzaDriver {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector(new PizzaHutBuilder());

        // Pizza Hut Pizzas
        try {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("********************** First Part with three pizza's from pizza hut of different sizes with 3, 6, 9 **************************");

            Pizza pizzaHutSmall = director.constructPizza("Small", List.of("Beef", "Olives", "Pesto"), "Pizza Hut");
            pizzaHutSmall.eat();

            Pizza pizzaHutMedium = director.constructPizza("Medium", List.of("Ham", "Pesto", "Extra Cheese", "Chicken", "Onions", "Peppers"), "Pizza Hut");
            pizzaHutMedium.eat();

            Pizza pizzaHutLarge = director.constructPizza("Large", List.of("Spicy Pork", "Mushrooms", "Ham", "Beef", "Extra Cheese", "Peppers", "Chicken", "Spinach", "Bacon"), "Pizza Hut");
            pizzaHutLarge.eat();




            // QUESTION 2
            System.out.println("**********************Second Part**************************");
            Pizza pizzaHutLarge2 = director.constructPizza(("Large"), List.of("Ham", "Mushrooms", "Sausage"), "Pizza Hut");
            Pizza pizzaHutSmall2 = director.constructPizza(("Small"), List.of("Olives", "Tomato and Basil"), "Pizza Hut");

            Pizza pizzaLittleCaesarsMedium = director.constructPizza(("Medium"), List.of("Pepperoni", "Mushrooms", "Extra Cheese", "Bacon", "Onions", "Peppers", "Chicken","Sausage"), "Little Caesars");
            Pizza pizzaLittleCaesarsSmall = director.constructPizza(("Small"), List.of("Tomato and Basil", "Extra Cheese", "Bacon", "Extra Cheese", "Chicken","Sausage"), "Little Caesars");

            Pizza pizzaDominosSmall = director.constructPizza(("Small"), List.of("Ham and Pineapple"), "Dominos");
            Pizza pizzaDominosLarge = director.constructPizza(("Large"), List.of("Pesto", "Extra Cheese", "Onions"), "Dominos");

            //Eating pizzas of question 2

            pizzaHutLarge2.eat();
            pizzaHutSmall2.eat();
            pizzaLittleCaesarsMedium.eat();
            pizzaLittleCaesarsSmall.eat();
            pizzaDominosSmall.eat();
            pizzaDominosLarge.eat();


        } catch (IllegalStateException e) {
            System.out.println("Problem creating Pizza: " + e.getMessage());
        }
    }
}
