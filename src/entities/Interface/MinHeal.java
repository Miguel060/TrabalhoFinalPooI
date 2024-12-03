package entities.Interface;

import entities.Character;

public class MinHeal implements Heal {
    @Override
    public void heal(Character character) {
        if (character.getFlagMaxHeal() < 2) {
            character.setHealth(character.getHealth() + character.getMaxHealth() / 2);
            if (character.getHealth() > character.getMaxHealth()) {
                character.setHealth(character.getMaxHealth());
                System.out.println(character.getName() + "utilizou o minHeal!");
            }
            character.setFlagMaxHeal(character.getFlagMaxHeal() + 1);
        } else {
            System.out.println("Não há MinHeal disponível para o " + character.getName() + "!");
        }
    }
}
