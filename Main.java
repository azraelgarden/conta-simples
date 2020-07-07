package com.contaSimples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        List<Client> clients = new ArrayList<>();

        long numberAccount = 111;
        int numberClient = 1;
        int menuOption = 0;
        Client actual = null;
        String output = "C:\\Users\\PICHAU\\Desktop\\0707\\resulttado2.txt";


        while(menuOption != 6) {
            System.out.println("Seja bem-vindo!");
            System.out.println("O que deseja fazer?");
            System.out.println("#1 - Cadastrar novo cliente");
            System.out.println("#2 - Cadastrar nova conta");
            System.out.println("#3 - Realizar um depósito");
            System.out.println("#4 - Realizar um saque");
            System.out.println("#5 - Exibir resultados");
            System.out.println("#6 - Sair do sistema");
            Scanner sc = new Scanner(System.in);
            System.out.println("Quando decidir, digite o número da opção escolhida.");
            menuOption = sc.nextInt();

            switch(menuOption) {
                case 1:
                    System.out.println();
                    System.out.println("Qual o nome do cliente?");
                    String name = sc.next();
                    clients.add(new Client(name, numberClient));
                    numberClient++;
                    System.out.println("O cadastro do cliente foi efetuado.");
                    System.out.println();
                    break;
                case 2:
                    if(clients == null) {
                        System.out.println();
                        System.out.println("Não encontramos nenhum cliente no sistema. Por favor, cadastre um novo cliente.");
                        break;
                    }
                    System.out.println();
                    System.out.println("Para qual client a conta vai ser criada?");
                    for(Client client : clients) {
                        System.out.println(client.getIdClient() + ". " + client.getNameClient());
                    }
                    int choosenClient = sc.nextInt();
                    for (Client client : clients) {
                        if (choosenClient == client.getIdClient()) {
                            actual = client;
                        }
                    }
                    accounts.add(new Account(numberAccount, actual));
                    System.out.println("O cadastro da conta foi realizado.");
                    numberAccount++;
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    for(Client client : clients) {
                        System.out.println(client.toString());
                        for (Account account : accounts) {
                            if (account.getClient() == client) {
                                System.out.println("#" + account.toString());
                            }
                        }
                    }
                    System.out.println("Para qual conta o depósito vai ser realizado?");
                    long id = sc.nextInt();
                    for (Account account : accounts) {
                        if (id == account.getAccountNumber()) {
                            System.out.println("Qual o valor em reais do depósito?");
                            double value = sc.nextDouble();
                            account.deposit(value);
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    for(Client client : clients) {
                        System.out.println(client.toString());
                        for (Account account : accounts) {
                            if (account.getClient() == client) {
                                System.out.println("#" + account.toString());
                            }
                        }
                    }
                    System.out.println("Para qual conta o saque vai ser realizado?");
                    id = sc.nextInt();
                    for (Account account : accounts) {
                        if (id == account.getAccountNumber()) {
                            System.out.println("Qual o valor em reais do saque?");
                            double value = sc.nextDouble();
                            account.withdraw(value);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    for(Client client : clients) {
                        System.out.println(client.toString());
                        for (Account account : accounts) {
                            if (account.getClient() == client) {
                                System.out.println("#" + account.toString());
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Obrigado pela confiança!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Por favor, escolha uma opção válida.");
            }
        }
    }

}

