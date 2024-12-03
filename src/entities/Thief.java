package entities;

import entities.Enums.ThiefWeapons;
import entities.Enums.WarriorWeapons;

public class Thief extends Character {
    private ThiefWeapons thiefWeapons;
    private ThiefArmy army;
    public Thief(String name, ThiefWeapons weapons) {
        super(name, 1400.00, 1600, 200, 30);
        this.army = new ThiefArmy(this);
        this.thiefWeapons = weapons;
    }

    @Override
    public void skill() {
        setHealth(getHealth() + (getHealth() * 0.20));
    }


    @Override
    public String getWeapons() {
        return thiefWeapons.toString();
    }

    @Override
    public void special(Character character) {
        double dano = 0.40 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.10 * getStrength();
        character.setHealth(character.getHealth() - dano);
    }

    @Override
    public Double getMaxHealth() {
        return 1400.00;
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

    @Override
    public ThiefArmy getArmy() {
        return army;
    }
}