package com.bocelli.ifsp.tcp.views;

import com.bocelli.ifsp.tcp.views.utils.Screen;

import java.io.IOException;
import java.util.Scanner;

public class ViewMain {
    private Scanner input = new Scanner(System.in);

    public void mainMenu() throws IOException, InterruptedException {
        Screen.clean();

        int opcao = 0;
        do {
            System.out
                    .println("\n\n############# TPC1 - Sistems de Oficina Mecânica #############");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Mecânicos     |");
            System.out.println("                  |     2 - Veículos      |");
            System.out.println("                  |     0 - Sair          |");
            System.out.println("                  =========================\n");

            System.out.println("Opção -> ");
            opcao = input.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    Screen.clean();
                    break;
                case 2:
                    Screen.clean();
                    //fornecedor();
                    break;
                case 0:
                    Screen.clean();
                    break;
                default:
                    Screen.clean();
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
