import clienteservidor.EncriptaDecriptaDES;
import clienteservidor.HashTextTest;
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
	    BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
	    DataOutputStream outToClient = new 	DataOutputStream(connectionSocket.getOutputStream());
            
		clientSentence = inFromClient.readLine();
                
                String[] mensagem = clientSentence.split(";");
                String texto = mensagem[0];
                String hash = mensagem[1];                
                
                String comparar = HashTextTest.sha1(texto);
                
                EncriptaDecriptaDES dES = new EncriptaDecriptaDES();
                String sentenceHash = dES.decripta(hash);
                
		capitalizedSentence = clientSentence.toUpperCase() + '\n';
		outToClient.writeBytes(capitalizedSentence);
		
	  }
		
	}
}
