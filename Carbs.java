package Assignment4.Q2.macronutrient;

public class Carbs implements Macronutrient {
    private String Name;

    public Carbs(String name) {
        this.Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Carbs: " + Name;
    }
}
