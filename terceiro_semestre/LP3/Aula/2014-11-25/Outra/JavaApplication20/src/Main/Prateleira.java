/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;


//informa que esta classe estende da interface observable é que sera o observado
public class Prateleira extends Observable{
    //esta classe é o arraylist do projeto
    //deve intsciar informando que é uma List
    //para poder usar os metodos da interface LIST
   private  List prateleira; 
   
   //informa que se o metodo pratleira for instciado ele cria uma nova ArrayList
   public Prateleira(){
       prateleira = new ArrayList();
   }
   //informa para a prateleira retonar os valores adicionados nela
    public List getPrateleira(){
       return prateleira; 
   }     
    //infoma para a prateleira receber os valores
       public void setPrateleira(List prateleira){       
       this.prateleira = prateleira;
   }

       //informa o metodo para adicionar o produto na prateleira
   public void add(Produto p){
       prateleira.add(p);       
       //informa que esse metodo sera observado
       this.setChanged();
       this.notifyObservers();
   }
   
   public void remove(int pos){
       prateleira.remove(pos);
       //informa que esse metodo sera observado
       this.setChanged();
       this.notifyObservers();
   }
   //retorna o tamanho da prateira quantos elementos ela possui
   public int size(){
        return prateleira.size();       
   }
   //caso queira retornar um unico produto da tabela esse metodo retorn apenas um produto
   public Object get(int pos){
      return prateleira.get( pos);
    }
   //interator percore a Arraylist um a um dos produtos.
   public Iterator iterator(){
       return prateleira.iterator();
   }     
}
