package entities;

public class Warrior extends Character {
    private String shield;

    public Warrior(String name, Weapons weapons) {
        super(name, 2000, 2000, 50, 150, weapons);
        this.shield = "Wood Shield";
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    @Override
    public void skill() {

    }

    @Override
    public void special() {

    }
}
