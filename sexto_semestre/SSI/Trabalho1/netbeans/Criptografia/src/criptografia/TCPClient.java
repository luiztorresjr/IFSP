package criptografia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class TCPClient{
    public static void main(String[] args) throws Exception{
       
        String mensagem;
        String mensagemModificada;
        
        BufferedReader entradaUsuario = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 6789);
        
        DataOutputStream saidaServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader  entradaServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
   
        
        mensagem = entradaUsuario.readLine();        
        saidaServer.flush();
        saidaServer.writeBytes(mensagem+'\n');
        
        mensagemModificada = entradaServer.readLine();
        
        System.out.println("FROM SERVER: "+mensagemModificada);
        
        clientSocket.close();
        
       
    }
}