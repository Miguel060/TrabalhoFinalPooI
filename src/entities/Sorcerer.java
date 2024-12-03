package entities;

import entities.Enums.SorcererWeapons;
import entities.Enums.WarriorWeapons;

public class Sorcerer extends Character {

    private SorcererWeapons weapons;
    private SorcererArmy army;

    public Sorcerer(String name, SorcererWeapons weapons) {
        super(name, 1300.00, 1500, 300, 400);
        this.weapons = weapons;
        this.army = new SorcererArmy(this);
    }

    @Override
    public void skill() {
        setHealth(getHealth() + (getHealth() * 0.20));
    }

    @Override
    public void special(Character character) {
        double dano = 0.15 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.10 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public String getWeapons() {
        return weapons.toString();
    }

    @Override
    public Double getMaxHealth() {
        return 1300.00;
    }
    @Override
    public SorcererArmy getArmy() {
        return army;
    }

    @Override
    public String infos(){
        return "Nome: "+getName()+
                " Arma: "+getWeapons()+
                " Vida Total: "+getMaxHealth()+
                " Inteligência: "+getIntelligence()+
                " Força:  "+getStrength()+
                " Vigor:"+getVigor();
    }
}