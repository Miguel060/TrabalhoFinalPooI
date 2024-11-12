package entities;

public class Warrior extends Character {
    private String shield;

    public Warrior(String name, Integer health, Integer strength, Integer vigor, Integer intelligence, Weapons weapons, String shield) {
        super(name, health, strength, vigor, intelligence, weapons);
        this.shield = shield;
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
