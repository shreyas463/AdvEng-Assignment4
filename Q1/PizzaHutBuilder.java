package Q1;

import java.util.List;

// Concrete builder for Pizza Hut
class PizzaHutBuilder implements PizzaBuilder {
    private String Size;
    private List<String> Toppings;
    private String Chain;

    @Override
    public PizzaBuilder setSize(String size) {
        this.Size = size;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(List<String> toppings) {
        this.Toppings = toppings;
        return this;
    }

    @Override
    public PizzaBuilder setChain(String chain) {
        this.Chain = chain;
        return this;
    }

    @Override
    public Pizza build() {
        if (Size == null) {
            throw new IllegalStateException("Size is required");
        }
        return new Pizza(Size, Toppings, Chain);
    }
}

