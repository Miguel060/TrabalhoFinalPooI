package entities;

import entities.Enums.WarriorWeapons;

public class Warrior extends Character {
    private String shield;
    private WarriorWeapons weapons;


    public Warrior(String name, WarriorWeapons weapons) {
        super(name, 2000.00, 2000, 50, 30);
        this.weapons = weapons;
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

    @Override
    public void atacar(Character character) {
        double dano = 0.10 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public Double getMaxHealth() {
        return 2000.00;
    }
}
