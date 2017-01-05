package clienteservidor;
//parte do soket
import java.io.*;
import java.net.*;
import java.util.Arrays;

//parte de criptografia


public class TCPClient {
    
    public static void main(String argv[]) throws Exception
    {
      //criação do soket  
      String sentence;
      String modifiedSentence;
      BufferedReader inFromUser = new BufferedReader(new 
                      InputStreamReader(System.in));

      Socket clientSocket = new Socket("127.0.0.1",15000);
      DataOutputStream outToServer = new 
            DataOutputStream(clientSocket.getOutputStream());

      BufferedReader inFromServer = new BufferedReader(new 
                      InputStreamReader(clientSocket.getInputStream()));
      //sentence = inFromUser.readLine();
      ElementoA elementoA;
      elementoA = new ElementoA();
      String msg="";
      String codeHash="";      
      msg=elementoA.lerMsg();
      //cria o codigo
      codeHash=elementoA.criarHash(msg);
      //
      //parte da criptografia
      // DES
      EncriptaDecriptaDES dES = new EncriptaDecriptaDES();
       byte[] textoEncriptado  = dES.encripta(msg, codeHash);
      //envia e recebe para o servidor
      msg =new String(textoEncriptado);
      System.out.println("FROM Client: Mensagem emcriptada em DES: " + Arrays.toString(textoEncriptado) );
      outToServer.writeBytes(msg+'\n');
      
      
      
      //pega do servidor a resposta
      modifiedSentence = inFromServer.readLine();
      System.out.println("FROM SERVER: " + modifiedSentence);
      clientSocket.close();
    }

}
