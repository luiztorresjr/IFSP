/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backup;

import loja.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

public class Prateleira extends Observable{
    
   private  ArrayList prateleira; 
   
   public Prateleira(){
       prateleira = new ArrayList();
   }
   
   public void add(Produto p){
       prateleira.add(p);
       this.setChanged();
       this.notifyObservers();
   }
   
   public void remove(int pos){
       prateleira.remove(pos);
       this.setChanged();
       this.notifyObservers();
   }
   
   public int size(){
        return prateleira.size();       
   }
   
   public Object get(int pos){
      return prateleira.get( pos);
    }
   
   public Iterator iterator(){
       return prateleira.iterator();
   }
   
   public ArrayList getPrateleira(){
       return prateleira; 
   }
   
}
