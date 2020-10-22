/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatsocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leocassio
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            Socket conexao = new Socket("localhost", 999); //estabelecer a conexao
            System.out.println("Conectado!");

            PrintStream saida = new PrintStream(conexao.getOutputStream());

            Scanner teclado = new Scanner(System.in);
             String mensagem;
            while ((mensagem = teclado.nextLine()) != null) {
                saida.println(teclado.nextLine());
            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
