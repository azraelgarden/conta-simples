package com.contaSimples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    private String nameClient;
    private int idClient;
    static String output = "C:\\Users\\PICHAU\\Desktop\\0707\\resulttado2.txt";

    public Client(String name, int id) {
        nameClient = name;
        idClient = id;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(output , true))){
            bw.write("Cliente: " + nameClient + " cadastrado com sucesso.");
            bw.newLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    @Override
    public String toString() {
        return "Client [idClient=" + idClient + ", nameClient=" + nameClient + "]";
    }


}
