package chatsocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leocassio
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(999); //Conexao
            System.out.println("Aguardando conexão");
            Socket conexao = servidor.accept(); //conexão aceita
            System.out.println("Conexão efetuada " + conexao.getInetAddress().getHostAddress()); //Apresenta quando um cliente se conecta ao servidor

            Scanner leitura = new Scanner(conexao.getInputStream());

            while (leitura.hasNextLine()) {
                System.out.println(leitura.nextLine());
            }
            
            leitura.close();
            conexao.close();
            servidor.close();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
