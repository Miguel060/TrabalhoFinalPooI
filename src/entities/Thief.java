package entities;

import entities.Enums.ThiefWeapons;
import entities.Enums.WarriorWeapons;

public class Thief extends Character {
    private ThiefWeapons thiefWeapons;
    public Thief(String name, ThiefWeapons weapons) {
        super(name, 1400.00, 1600, 200, 30);
        this.thiefWeapons = weapons;
    }

    @Override
    public void skill() {

    }

    @Override
    public void special() {

    }

    @Override
    public void atacar(Character character) {

    }
}
