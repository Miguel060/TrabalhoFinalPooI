package entities;

import entities.Interface.Army;

public abstract class AbstractArmy implements Army {
    protected Double health;
    protected Integer strength;
    protected Character character;

    public AbstractArmy(Character character) {
        this.health = character.getHealth()/3;
        this.strength = character.getStrength()/3;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
    public abstract String WarCry();
}
