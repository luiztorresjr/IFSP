package clienteservidor;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String argv[]) throws Exception
	{
      String sentence;
	  String modifiedSentence;
	  BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
	  
            try (Socket clientSocket = new Socket("127.0.0.1",15000)) {
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                
                sentence = inFromUser.readLine();
                
                String sentenceHash=HashTextTest.sha1(sentence);
                EncriptaDecriptaDES dES = new EncriptaDecriptaDES();
                sentenceHash= dES.encripta(sentence, sentenceHash);
                
                sentence+=";"+sentenceHash;
                
                outToServer.flush();
                
                outToServer.writeBytes(sentence + '\n');
                modifiedSentence = inFromServer.readLine();
                System.out.println("FROM SERVER: " + modifiedSentence);
            }
	}
	
}
