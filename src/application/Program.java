package application;

import entities.*;
import entities.Character;
import entities.Enums.SorcererWeapons;
import entities.Enums.ThiefWeapons;
import entities.Enums.WarriorWeapons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Escolha o " + (i + 1) + "º personagem: ");
            System.out.println("1 - Guerreiro\n2 - Bandido\n3 - Mago");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Dê um nome para o " + (i + 1) + "º personagem: ");
            String nome = scanner.nextLine();

            switch (opcao) {
                case 1:
                    Warrior warrior = new Warrior(nome, WarriorWeapons.HAMMER);
                    characters.add(warrior);
                    break;
                case 2:
                    Thief thief = new Thief(nome, ThiefWeapons.KNIFE);
                    characters.add(thief);
                    break;
                case 3:
                    Sorcerer sorcerer = new Sorcerer(nome, SorcererWeapons.FIRE);
                    characters.add(sorcerer);
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    i--;
                    break;
            }
        }
        if (characters.size() == 2) {
            Character player1 = characters.get(0);
            Character player2 = characters.get(1);

            System.out.println("\nPersonagens selecionados:");
            System.out.println("Jogador 1: " + player1.getName() + " - Classe: " + player1.getClass().getSimpleName());
            System.out.println("Jogador 2: " + player2.getName() + " - Classe: " + player2.getClass().getSimpleName());

            Arena arena = new Arena();
            arena.duelo(player1, player2);
        } else {
            System.out.println("Erro: número insuficiente de personagens para iniciar a batalha.");
        }

        scanner.close();
    }
}
