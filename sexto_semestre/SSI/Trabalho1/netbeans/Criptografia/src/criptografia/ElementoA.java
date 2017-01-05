package criptografia;


import java.util.Scanner;
import static criptografia.HashTextTest.sha1;
import static criptografia.HashTextTest.sha2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1320726
 */
public class ElementoA {
    public String lerMsg(){
     Scanner scanner= new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String msg = scanner.next();
        return msg;
    }    
    
    public String criarHash(String msg){
        String codeHashA=null;
         try{
           codeHashA = sha2(msg);
        }catch(Exception e){
            e.printStackTrace();
        }
        return codeHashA;
    }     
       
    
}
