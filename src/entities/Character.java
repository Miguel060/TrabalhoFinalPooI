package entities;

import entities.Enums.WarriorWeapons;

public abstract class Character {
    protected String name;
    protected Double health;
    protected Integer strength;
    protected Integer vigor;
    protected Integer intelligence;
    protected WarriorWeapons weapons;

    public Character(String name, Double health, Integer strength, Integer vigor, Integer intelligence) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.vigor = vigor;
        this.intelligence = intelligence;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setVigor(Integer vigor) {
        this.vigor = vigor;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getVigor() {
        return vigor;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public WarriorWeapons getWeapons() {
        return weapons;
    }

    public abstract void skill();

    public abstract void special();

    public abstract void atacar(Character character);

}

