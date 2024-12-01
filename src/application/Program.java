package application;

import entities.Character;
import entities.Enums.SorcererWeapons;
import entities.Enums.WarriorWeapons;
import entities.Sorcerer;
import entities.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Sorcerer mago = new Sorcerer("Orion", SorcererWeapons.FIRE);
        System.out.println(mago.getName());
        System.out.println(mago.getHealth());
        Warrior guerreiro = new Warrior("Brutus", WarriorWeapons.AXE);
        System.out.println(guerreiro.getName());
        System.out.println(guerreiro.getHealth());
        mago.atacar(guerreiro);
        System.out.println(guerreiro.getHealth());
    }
}
