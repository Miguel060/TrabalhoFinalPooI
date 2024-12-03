package entities;

import java.util.Scanner;

public class InputValidator {

    public static int chooseOneOrTwo(Scanner sc) {
        System.out.println("Escolha um número: 1 ou 2.");
        int choice = sc.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Escolha inválida! Por favor, escolha apenas 1 ou 2.");
            choice = sc.nextInt();
        }

        return choice;
    }
}