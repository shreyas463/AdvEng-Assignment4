package Assignment4.Q2.macronutrient;

public class Fats implements Macronutrient {
    private String Name;

    public Fats(String name) {
        this.Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Fats: " + Name;
    }
}
