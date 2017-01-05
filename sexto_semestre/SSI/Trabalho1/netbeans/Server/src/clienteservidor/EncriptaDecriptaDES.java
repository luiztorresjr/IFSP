/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservidor;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class EncriptaDecriptaDES {

    public static void main(String[] argv) {
        try {
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            
            SecretKey chaveDES = keygenerator.generateKey();
            Cipher cifraDES; // Cria a cifra 
            cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding"); 
            // Inicializa a cifra para o processo de encriptação 
            cifraDES.init(Cipher.ENCRYPT_MODE, chaveDES); 
            // Texto puro 
            byte[] textoPuro = "Exemplo de texto puro".getBytes(); 
            System.out.println("Texto [Formato de Byte] : " + Arrays.toString(textoPuro)); 
            System.out.println("Texto Puro : " + new String(textoPuro)); 
            // Texto encriptado 
            byte[] textoEncriptado = cifraDES.doFinal(textoPuro); 
            System.out.println("Texto Encriptado : " + Arrays.toString(textoEncriptado)); 
            // Inicializa a cifra também para o processo de decriptação 
            cifraDES.init(Cipher.DECRYPT_MODE, chaveDES); 
            // Decriptografa o texto 
            byte[] textoDecriptografado = cifraDES.doFinal(textoEncriptado); 
            System.out.println("Texto Decriptografado : " + new String(textoDecriptografado)); 
        }catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e){ 
        } 
    } 
    public String encripta (String msg,String codeHash){
        byte[] textoEncriptado = null;
        String retorno = null;
      try{
        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        
        SecretKey chaveDES = keygenerator.generateKey();
        Cipher cifraDES; // Cria a cifra 
        cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding"); 
        // Inicializa a cifra para o processo de encriptação 
        cifraDES.init(Cipher.ENCRYPT_MODE, chaveDES);
        
        // Texto puro 
        String msgHash= msg+' '+codeHash;
       
        //Encode e = new 
        byte[] textoPuro = msgHash.getBytes(); 
        System.out.println("Texto [Formato de Byte] : " + Arrays.toString(textoPuro)); 
        System.out.println("Texto Puro : " + new String(textoPuro)); 
        // Texto encriptado 
        textoEncriptado = cifraDES.doFinal(textoPuro);        
        System.out.println("Texto Encriptado : " + Arrays.toString(textoEncriptado)); 
        // Inicializa a cifra também para o processo de decriptação 
    }catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e){ 
    } 
    return retorno;  
    }
    
  public String decripta (String msg){
        byte[] textoEncriptadoRecebido = null;
        byte[] textoDecriptografado = null;
        try{
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey chaveDES = keygenerator.generateKey();
            Cipher cifraDES; // Cria a cifra 
            cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding"); 
            
            textoEncriptadoRecebido = msg.getBytes();
            
            // Texto encriptado 

            cifraDES.init(Cipher.DECRYPT_MODE, chaveDES); 
            // Decriptografa o texto 
            textoDecriptografado = cifraDES.doFinal(textoEncriptadoRecebido); 
            System.out.println("Texto Decriptografado : " + new String(textoDecriptografado));
      }catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e){ 
      }
    String mensagemDecrip=new String(textoDecriptografado);
    return mensagemDecrip;  
    }
}


