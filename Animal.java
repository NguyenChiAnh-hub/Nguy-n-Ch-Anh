package Animal;

public class Animal {
    protected String habitat;
    protected int averageAge;
    protected String name;
    protected int currentAge;

    public Animal(String habitat, int averageAge, String name, int currentAge) {
        this.habitat = habitat;
        this.averageAge = averageAge;
        this.name = name;
        this.currentAge = currentAge;
    }

    public String getInfo() {
        return "Name: " + name + ", Current Age: " + currentAge + ", Species: " + this.getClass().getSimpleName() +
                ", Average Age: " + averageAge + ", Habitat: " + habitat;
    }

    public boolean isSameAge(Animal other) {
        return this.currentAge == other.currentAge;
    }
}
