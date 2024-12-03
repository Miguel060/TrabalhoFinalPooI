package entities;

import entities.Interface.Army;
import entities.Interface.MaxHeal;
import entities.Interface.MinHeal;

import java.util.Random;
import java.util.Scanner;

public class Arena {

    public void duelo(Character p1, Character p2) {
        Scanner sc = new Scanner(System.in);
        int rounds = 1;
        MaxHeal maxHeal = new MaxHeal();
        MinHeal minHeal = new MinHeal();
        System.out.println("Olá, Guerreiro! Bem-vindo à arena!");
        while (true) {
            System.out.println(" 1-Iniciar batalha\n 2-Regras\n 3-Informações dos jogadores\n 4-Sair");
            int op = sc.nextInt();

            if (op == 1) {
                Character currentAttacker = decideFirstAttacker(p1, p2, sc);
                Character currentDefender = (currentAttacker == p1) ? p2 : p1;

                while (p1.getHealth() > 0 && p2.getHealth() > 0) {
                    System.out.println("\n--- Rodada " + rounds + " ---");
                    System.out.println(currentAttacker.getName() + " está atacando!");

                    System.out.println("Escolha uma ação: ");
                    System.out.println("1 - Atacar");
                    System.out.println("2 - Usar habilidade especial");
                    System.out.println("3 - Usar item de cura");
                    System.out.println("4 - Exército");
                    int action = sc.nextInt();
                    switch (action) {
                        case 1:
                            currentAttacker.atacar(currentDefender);
                            System.out.println(currentAttacker.getName() + " atacou " + currentDefender.getName() + " com " + currentAttacker.getWeapons());
                            System.out.println("A vida de " + currentDefender.getName() + " caiu para: " + currentDefender.getHealth());
                            break;

                        case 2:
                            if(rounds%2 == 0){
                                currentAttacker.special(currentDefender);
                                System.out.println("A vida de " + currentDefender.getName() + " caiu para: " + currentDefender.getHealth());
                                break;
                            }else{
                                System.out.println("Ainda não é possível utilizar a habilidade especial, realize um ataque primeiro!");
                                break;
                            }
                        case 3:
                            System.out.println("Escolha um item de cura: ");
                            System.out.println(" 1-MaxHeal\n 2-MinHeal");
                            int op2 = sc.nextInt();
                            if (op2 == 1) {
                                maxHeal.heal(currentAttacker);
                                System.out.println(currentAttacker.getHealth());
                            } else if (op2 == 2) {
                                minHeal.heal(currentAttacker);
                                System.out.println(currentAttacker.getHealth());
                            }
                        case 4:
                            System.out.println("Escolha uma opção para o exército: ");
                            System.out.print(" 1- Grito de guerra\n 2- Atacar\n");
                            int op3 = sc.nextInt();
                            if (op3 == 1) {
                                System.out.println(currentAttacker.getArmy().WarCry());
                            } else if (op3 == 2) {
                                currentAttacker.getArmy().atacar(currentDefender);
                                System.out.println(currentAttacker.getName() + " usou o exército para atacar!");
                                System.out.println("A vida de " + currentDefender.getName() + " caiu para: " + currentDefender.getHealth());
                            }

                    }
                    if (currentDefender.getHealth() <= 0) {
                        System.out.println("\n" + currentDefender.getName() + " foi derrotado!");
                        System.out.println(currentAttacker.getName() + " é o vencedor!");
                        break;
                    }
                    Character temp = currentAttacker;
                    currentAttacker = currentDefender;
                    currentDefender = temp;

                    rounds++;
                }
            } else if (op == 2) {
                System.out.println("\nRegras: ");
                System.out.println("1 - Cada jogador pode atacar uma vez por rodada");
                System.out.println("2 - Cada jogador pode usar o MaxShield apenas uma vez por partida.");
                System.out.println("3 - Cada jogador pode usar o MinShield até duas vezes por partida.");
                System.out.println("As habilidades especiais apenas podem ser usadas em rodadas de número par!");
            } else if (op == 3) {
                System.out.println("\nInformações dos jogadores:");
                System.out.println("Jogador 1: " + p1.infos());
                System.out.println("Jogador 2: " + p2.infos());
            } else if (op == 4) {
                System.out.println("Encerrando o jogo");
                break;
            } else {
                System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
            sc.close();
    }

    private Character decideFirstAttacker(Character p1, Character p2, Scanner sc) {
        Random random = new Random();

        System.out.println("\nDecidindo quem começa com um cara ou coroa!");
        System.out.println(p1.getName() + ", escolha: 1 para Cara ou 2 para Coroa.");
        int choiceP1 = chooseOneOrTwo(sc);

        int coinFlip = random.nextInt(2) + 1; // Gera 1 ou 2 aleatoriamente

        System.out.println("\nA moeda caiu em " + (coinFlip == 1 ? "Cara!" : "Coroa!"));

        if (choiceP1 == coinFlip) {
            System.out.println(p1.getName() + " venceu o cara ou coroa e começará atacando!");
            return p1;
        } else {
            System.out.println(p2.getName() + " venceu o cara ou coroa e começará atacando!");
            return p2;
        }
    }

    private int chooseOneOrTwo(Scanner sc) {
        System.out.println("Escolha um número: 1 ou 2.");
        int choice = sc.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Escolha inválida! Por favor, escolha apenas 1 ou 2.");
            choice = sc.nextInt();
        }

        return choice;
    }
}
