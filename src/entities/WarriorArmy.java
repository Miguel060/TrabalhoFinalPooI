package entities;

public class WarriorArmy extends AbstractArmy{
    public WarriorArmy(Warrior character) {
        super(character);
    }

    @Override
    public String WarCry() {
        return "Por honra e glória, nenhum inimigo permanecerá de pé!";
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.20*getStrength();
        character.setHealth(character.getHealth() - dano);
    }
}
