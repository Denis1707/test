public class Mage extends Unit {
    private int mana;

    public Mage(int health, String name, int mana) {
        super(health, name);
        this.mana = mana;
    }
    public Mage(Mage mage) {

        super(mage);
        this.mana = mage.mana;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: " + mana);


    }
}