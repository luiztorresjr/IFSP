/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Luiz
 */
public class Des {
    Cipher crip;
    Cipher descrip;
    
    Des() throws Exception{
        
       KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        SecretKey key = keygenerator.generateKey();
        
        crip = Cipher.getInstance("DES/ECB/PKCS5Padding");
        descrip = Cipher.getInstance("DES/ECB/PKCS5Padding");
        
        crip.init(Cipher.ENCRYPT_MODE, key);
        descrip.init(Cipher.DECRYPT_MODE, key);
    }
    
    public String criptografa(String s) throws Exception{
        byte[] utf8 = s.getBytes("UTF8");
        
        byte[] enc = crip.doFinal(utf8);
        
        return new sun.misc.BASE64Encoder().encode(enc);
    }
    
    public String descriptografa(String s) throws Exception{
        byte[] des = new sun.misc.BASE64Decoder().decodeBuffer(s);
        
        byte[] utf8 = descrip.doFinal(des);
        
        // Decode using utf-8
        return new String(utf8, "UTF8");
    }
}
