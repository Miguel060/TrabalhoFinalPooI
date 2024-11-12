package entities;

public abstract class Character {
    protected String name;
    protected Integer health;
    protected Integer strength;
    protected Integer vigor;
    protected Integer intelligence;
    protected Weapons weapons;

    public Character(String name, Integer health, Integer strength, Integer vigor, Integer intelligence, Weapons weapons) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.vigor = vigor;
        this.intelligence = intelligence;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getVigor() {
        return vigor;
    }

    public void setVigor(Integer vigor) {
        this.vigor = vigor;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
    public abstract void skill();
    public abstract void special();

    }

