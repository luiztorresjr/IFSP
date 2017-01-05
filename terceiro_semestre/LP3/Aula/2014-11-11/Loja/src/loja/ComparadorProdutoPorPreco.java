

package loja;

import java.util.Comparator;


public class ComparadorProdutoPorPreco implements Comparator {
    public int compare(Object produto1, Object produto2){
        Produto  prod1 =(Produto)produto1;
        Produto  prod2 =(Produto)produto2;
       
        if(prod1.getPreco() == prod2.getPreco())
           return 0;
       else if(prod1.getPreco() < prod2.getPreco())
           return -1;
       else return 1;
    }
}
    
