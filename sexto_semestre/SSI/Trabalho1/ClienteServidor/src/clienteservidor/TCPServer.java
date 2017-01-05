package clienteservidor;

import java.io.*;
import java.net.*;

public class TCPServer {

	public static void main(String argv[]) throws Exception
	{
	  String clientSentence;
	  String capitalizedSentence;
	  ServerSocket welcomeSocket = new ServerSocket(15000);
	
	  while(true) {
	    Socket connectionSocket = welcomeSocket.accept();
	    BufferedReader inFromClient = new BufferedReader(new 
	    		InputStreamReader(connectionSocket.getInputStream()));
	    DataOutputStream outToClient = new 
	    	DataOutputStream(connectionSocket.getOutputStream());
                //pega msg do CLIENTE
           
		clientSentence = inFromClient.readLine();
                //Descriptografa
                
                EncriptaDecriptaDES dES = new EncriptaDecriptaDES();
                clientSentence = dES.decripta(clientSentence);
               
                int fim =clientSentence.indexOf(" ");
                String hashCodeA = clientSentence.substring(0,fim);
                String msg = clientSentence.substring(fim+1,clientSentence.length());
                System.out.println("hash code: "+hashCodeA+" mensagem: "+msg);
                elementoB b = new elementoB();
                if (b.verificar(msg,hashCodeA)){
		capitalizedSentence = "Mensagem varificada sem erros"+'\n';
                }else{
                    capitalizedSentence = "Mensagem varificada com erros"+'\n';
                }
		outToClient.writeBytes(capitalizedSentence);
	  }
		
	}
}
