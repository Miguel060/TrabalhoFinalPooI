package entities.Interface;

import entities.Character;

public class MaxHeal implements Heal{
    public MaxHeal() {
    }

    @Override
    public void heal(Character character) {
        if(character.getFlagMaxHeal()<1) {
            character.setHealth(character.getMaxHealth());
            character.setFlagMaxHeal(character.getFlagMaxHeal()+1);
        }else{
            System.out.println("Não há MaxHeal disponível para o "+ character.getName()+"!");
        }
    }
}
