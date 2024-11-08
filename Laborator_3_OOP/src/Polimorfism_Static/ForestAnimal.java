package Polimorfism_Static;

public class ForestAnimal {
    private String species;
    private String title;
    private int energyLevel;

    public ForestAnimal(String species, String title) {
        this.species = species;
        this.title = title;
        this.energyLevel = (int)(Math.random() * 100); // Random initial energy level
    }

    public void performAction(String action) {
        System.out.println(species + " performs a basic " + action + ".");
        energyLevel -= 10;
        System.out.println("Energy after action: " + energyLevel);
    }

    public void performAction(String action, int intensity) {
        System.out.println(species + " performs " + action + " with intensity level " + intensity + "!");
        energyLevel -= 10 + intensity;
        System.out.println("Energy after action: " + energyLevel);
    }

    public void performAction(String action, int intensity, String resource) {
        System.out.println(species + " performs " + action + " and finds " + resource + " with intensity " + intensity + ".");
        energyLevel -= 10 + intensity;
        System.out.println("Energy after action: " + energyLevel);
    }

    public void performAction(String action, String timeOfDay) {
        System.out.println(species + " performs " + action + " during " + timeOfDay + ".");
        energyLevel -= 5;
        System.out.println("Energy after action: " + energyLevel);
    }

    public void performAction(String action, String timeOfDay, boolean useWisdom) {
        System.out.println(species + " performs " + action + " during " + timeOfDay + " with wisdom: " + useWisdom + ".");
        energyLevel -= 5;
        if (useWisdom) energyLevel += 15; // Wisdom boosts energy for owls
        System.out.println("Energy after action: " + energyLevel);
    }

    @Override
    public String toString() {
        return "Forest Animal:\n" +
                "Species: " + species + '\n' +
                "Title: " + title + '\n' +
                "Energy Level: " + energyLevel + '\n';
    }
}