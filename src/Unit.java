
public class Unit {
    private int health;
    private String name;
    public Unit(int health, String name) {
        this.health = health;
        this.name = name;
    }
    public Unit(Unit unit) {
        this.health = unit.health;
        this.name = unit.name;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
}
