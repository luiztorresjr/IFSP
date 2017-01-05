package criptografia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer{
    public static void main(String[] args) throws Exception{
        String clientMensagem; 
        String maiusculaMensagem; 
        
        ServerSocket entradaSocket = new ServerSocket(6789);
        
        while (true) {            
            
            Socket conectaSocket = entradaSocket.accept();
            BufferedReader entradaClient = new BufferedReader(new InputStreamReader(conectaSocket.getInputStream()));
            DataOutputStream saidaCliente = new DataOutputStream(conectaSocket.getOutputStream());
            
            Des d = new Des();
            
            clientMensagem = d.descriptografa(entradaClient.readLine());
           
            maiusculaMensagem=clientMensagem.toUpperCase()+'\n';
            
            saidaCliente.writeBytes(maiusculaMensagem);
        }
   }
}