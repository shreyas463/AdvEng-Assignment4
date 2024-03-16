package Assignment4.Q2.macronutrient;

public class Protein implements Macronutrient {
    private String Name;

    public Protein(String name) {
        this.Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Protein: " + Name;
    }
}
