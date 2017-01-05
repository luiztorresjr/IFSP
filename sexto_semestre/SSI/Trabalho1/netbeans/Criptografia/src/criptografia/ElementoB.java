/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import static criptografia.HashTextTest.sha1;
import static criptografia.HashTextTest.sha2;


/**
 *
 * @author a1320726
 */
public class ElementoB {
    public boolean verificar(String msg,String codeHashA){
        String codeHashB=null;
        try{
           codeHashB = sha2(msg);
        }catch(Exception e){
            e.printStackTrace();
        }
       boolean iguais = true; 
       char[] hashA = codeHashA.toCharArray();
       char[] hashB = codeHashB.toCharArray();
       System.out.println("Codigo hash: "+codeHashA);
       for(int i=0;i<codeHashA.length();i++){ 
           System.out.println("Caracteres comparados: variavelA: "+hashA[i]+" variavelB: "+hashB[i]);
           if(hashA[i] != hashB[i]){
               iguais=false;            
           }
           
           
       }
        System.out.println("Resultado: "+iguais);
        return iguais;
    }
    
    
    
}
