package entities;

import java.util.Random;
import java.util.Scanner;

public class Arena {

    public void duelo(Character p1, Character p2) {
        Scanner sc = new Scanner(System.in);
        int rounds = 1;
        System.out.println("Olá Guerreiro bem vindo à arena!");
        System.out.println(" 1-Iniciar batalha\n 2-Regras\n 3-Informações dos jogadores");
        int op = sc.nextInt();
        if (op == 1) {
            while (p1.getHealth() != 0 || p2.getHealth() != 0) {
                System.out.println("Rodada " + rounds);
                decideFirstAttacker(p1, p2, sc);

            }
        } else if (op == 2) {
            System.out.println("Regras: ");
            System.out.println("1-Por padrão cada jogador poderá atacar apenas uma vez por rodada, exceto o bandido quando utiliza sua habilidade especial, que poderá atacar por duas rodadas consecutivas.");
            System.out.println("2-Cada jogador poderá utilizar o MaxShield apenas uma vez por partida.");
            System.out.println("4-Cada jogador poderá utilizar p MinShield até duas vezes por partida.");
            System.out.println("5-O jogador que eliminar o exército adversário ganhará o direito de duas rodadas consecutivas");
            System.out.println("6-");

        } else if (op == 3) {

        }


    }

    private Character decideFirstAttacker(Character p1, Character p2, Scanner sc) {
        Random random = new Random();

        System.out.println("\nDecidindo quem começa com um cara ou coroa!");
        System.out.println(p1.getName() + ", escolha: 1 para Cara ou 2 para Coroa.");
        int choiceP1 = InputValidator.chooseOneOrTwo(sc); // Chama a função para validar a entrada

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

}
