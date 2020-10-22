
package chatsocket;

import java.net.ServerSocket;

/**
 *
 * @author Leocassio
 */
public class Servidor {
    
    public static void main(String[] args) {
        try {
             ServerSocket conexao = new ServerSocket(999); //Conexao
            System.out.println("Aguardando conexão");
        } catch (Exception e) {
        }
    }
    
}
