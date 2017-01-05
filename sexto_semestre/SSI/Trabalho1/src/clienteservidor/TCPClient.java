package clienteservidor;
//parte do soket
import java.io.*;
import java.net.*;
//parte de criptografia
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


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
      
      
      //parte do cliente A
      // Criaçao e leitura das mensagens
      ElementoA elementoA = new ElementoA();
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
      System.out.println("FROM Client: Mensagem emcriptada em DES: " + textoEncriptado );
      outToServer.writeBytes(msg+'\n');
      
      
      //pega do servidor a resposta
      modifiedSentence = inFromServer.readLine();
      System.out.println("FROM SERVER: " + modifiedSentence);
      clientSocket.close();
    }

}
