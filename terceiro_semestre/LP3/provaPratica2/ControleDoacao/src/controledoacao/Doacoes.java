package controledoacao;

import java.util.*;

/**
 *
 * @author a132067x
 */


public class Doacoes extends Observable{
    private List doacoes;
    
    public Doacoes(){
       doacoes = new ArrayList();
   }
   
    public List getDoacoes(){
       return doacoes; 
   }     
    
       public void setDoacoes(List contaDoacao){       
       this.doacoes = contaDoacao;
   }

       
   public void add(Doacao d){
       doacoes.add(d);
       this.setChanged();
       this.notifyObservers();
   }
   
   public void remove(int pos){
       doacoes.remove(pos);
       this.setChanged();
       this.notifyObservers();
   }
   
   public int size(){
        return doacoes.size();       
   }
   
   public Object get(int pos){
      return doacoes.get( pos);
    }
   
   public Iterator iterator(){       
       this.setChanged();
       this.notifyObservers();
       return doacoes.iterator();
   }     
}
