

package Main;

import java.util.Comparator;


public class ComparadorProdutoPorPreco implements Comparator {
    //implemeta o comparato para os objetos
    public int compare(Object produto1, Object produto2){
        
        //instacia o tipo do objeto para produto
        Produto  prod1 =(Produto)produto1;
        Produto  prod2 =(Produto)produto2;
       
        
        //compara os produto. 
        if(prod1.getPreco() == prod2.getPreco())
           return 0;
       else if(prod1.getPreco() < prod2.getPreco())
           return -1;
       else return 1;
    }
}
    
