package entities;

public class ThiefArmy extends AbstractArmy{

    public ThiefArmy(Thief thief) {
        super(thief);
    }

    @Override
    public String WarCry() {
        return "Das sombras eu venho... e só o caos restará!";
    }

    @Override
    public void atacar(Character character) {
        double dano = 0.20*getStrength();
        character.setHealth(character.getHealth() - dano);
    }
}
