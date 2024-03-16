package Q1;

import java.util.List;

// Builder interface for pizza
interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setToppings(List<String> toppings);
    PizzaBuilder setChain(String chain);
    Pizza build();
}

