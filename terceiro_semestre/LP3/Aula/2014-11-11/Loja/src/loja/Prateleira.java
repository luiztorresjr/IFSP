/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public class Prateleira extends Observable{
    
   private  List prateleira; 
   
   public Prateleira(){
       prateleira = new ArrayList();
   }
   
    public List getPrateleira(){
       return prateleira; 
   }     
    
       public void setPrateleira(List prateleira){       
       this.prateleira = prateleira;
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
}
