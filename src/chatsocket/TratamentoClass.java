package chatsocket;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Leocassio
 */
class TratamentoClass implements Runnable {

    private Socket conexao;

    TratamentoClass(Socket conexao) {
        this.conexao = conexao;
    }

    @Override
    public void run() {

        try {
            System.out.println("Conexão efetuada " + conexao.getInetAddress().getHostAddress()); //Apresenta quando um cliente se conecta ao servidor

            Scanner leitura = new Scanner(conexao.getInputStream());

            while (leitura.hasNextLine()) {
                System.out.println(leitura.nextLine());
            }
            leitura.close();
            conexao.close();
        } catch (Exception e) {
        }
    }

}
