package entities;

import entities.Enums.SorcererWeapons;
import entities.Interface.Army;

public class SorcererArmy implements Army {
    Double health;
    Integer Strength;
    private Sorcerer sorcerer;

    public SorcererArmy(Double health, Integer strength) {
        this.health = health;
        Strength = strength;
    }

    @Override
    public void atacar(Character character) {

    }

    @Override
    public void buffChar(Character character) {

    }
}
