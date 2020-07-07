package com.contaSimples;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Account {
    private long numberAccount;
    private Client client;
    private double balance;
    static String output = "C:\\Users\\PICHAU\\Desktop\\0707\\resulttado2.txt";
    public Account(long numberAccount, Client client) {
        this.numberAccount = numberAccount;
        this.client = client;
        this.balance = 0.0;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(output , true))){
            bw.write("ID da nova conta: " + this.numberAccount + ". Cliente: " + client.getNameClient());
            bw.newLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long getAccountNumber() {
        return numberAccount;
    }

    public void setAccountNumber(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double value) {
        if(value > balance) {
            System.out.println("Você não tem saldo suficiente para esse saque.");
        }
        else {
            balance -= value;
            System.out.println("R$ " + value + " sacado.");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(output , true))){
                bw.write("R$ " + value + " sacado para o ID " + this.numberAccount + " do cliente " + client.getNameClient());
                bw.newLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deposit(double value) {
        if(value > 0) {
            balance += value;
            System.out.println("Depósito realizado!");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(output , true))){
                bw.write("R$ " + value + " depositado para o ID " + this.numberAccount + " do cliente " + client.getNameClient());
                bw.newLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Não foi possível realizar o depósito.");
        }

    }

    @Override
    public String toString() {
        return "Account [numberAccount=" + numberAccount + ", client=" + client.getNameClient() + ", balance=" + balance + "]";
    }


}
