package com.bocelli.ifsp.tcp.views;

import com.bocelli.ifsp.tcp.model.Mechanic;
import com.bocelli.ifsp.tcp.model.Shop;
import com.bocelli.ifsp.tcp.views.utils.Screen;

import java.io.IOException;
import java.util.Scanner;

public class ViewMechanic {
    private Scanner input = new Scanner(System.in);

    public void subMenu(Shop shop) throws IOException, InterruptedException {
        Screen.clean();

        int opcao = 0;
        do {
            System.out
                    .println("\n\n##################### TPC1 - Mecânicos #####################");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Listar Todos    |");
            System.out.println("                  |     2 - Listar Um       |");
            System.out.println("                  |     3 - Incluir         |");
            System.out.println("                  |     2 - Alterar         |");
            System.out.println("                  |     2 - Exluir          |");
            System.out.println("                  |     0 - Sair            |");
            System.out.println("                  =========================\n");

            System.out.println("Opção -> ");
            opcao = input.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    Screen.clean();
                    shop.listMechanics();
                    break;
                case 2:
                    Screen.clean();
                    System.out.println("Digite o id -> ");
                    opcao = input.nextInt();
                    if (shop.getMechanic(opcao) == null) System.out.println("Id inválido!");
                    else shop.getMechanic(opcao).toString();
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

    private Mechanic add() {
        Mechanic mechanic = new Mechanic();

        System.out.println("Pressione exit ou -1 para desistir");

        boolean flag = false;

        // CPF
        do {
            System.out.println("Digite o CPF XXX.XXX.XXX-XX -> ");
            String cpf = input.nextLine();

            if(cpf.equals("exit") || cpf.equals("-1")) return null;
            try {
                mechanic.setCpf(cpf);
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (flag == false);

        // Nome
        flag = false;
        do {
            System.out.println("Digite o Nome -> ");
            String name = input.nextLine();

            if(name.equals("exit") || name.equals("-1")) return null;
            try {
                mechanic.setName(name);
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (flag == false);

        // Digite a Data de Nascimento
        flag = false;
        do {
            System.out.println("Digite a Data de Nascimento dd/mm/YYYY -> ");
            String dateBirth = input.nextLine();

            if(dateBirth.equals("exit") || dateBirth.equals("-1")) return null;
            try {
                mechanic.setDateOfBirth(dateBirth);
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (flag == false);

        // Sexo
        flag = false;
        do {
            System.out.println("Digite o sexo M/F -> ");
            String gender = input.nextLine();

            if(gender.equals("exit") || gender.equals("-1")) return null;
            try {
                mechanic.setGender(gender);
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (flag == false);

        // Sexo
        flag = false;
        do {
            System.out.println("Digite o sexo M/F -> ");
            String gender = input.nextLine();

            if(gender.equals("exit") || gender.equals("-1")) return null;
            try {
                mechanic.setGender(gender);
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (flag == false);


        return mechanic;
    }
}
