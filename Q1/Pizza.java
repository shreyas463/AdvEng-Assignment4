package Q1;

import java.util.List;


class Pizza {
    private String Size;
    private List<String> Toppings;
    private String Chain;

    public Pizza(String size, List<String> toppings, String chain) {
        this.Size = size;
        this.Toppings = toppings;
        this.Chain = chain;
    }

    public void eat() {
        System.out.println(Chain + " Pizza - Size: " + Size + ", Toppings: " + String.join(", ", Toppings));
    }
}

