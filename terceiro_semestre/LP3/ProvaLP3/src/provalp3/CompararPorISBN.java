/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provalp3;

import java.util.Comparator;

/**
 *
 * @author a132067x
 */
public class CompararPorISBN implements Comparator {
    public int compare(Object livro1, Object livro2){
		//estancia o objeto e informa de que tipo o objeto será neste caso livro
        Livro  li1 =(Livro) livro1;
        Livro  li2 =(Livro) livro2;
       
        if(li1.getIsbn() == li2.getIsbn())
           return 0;
       else if(li1.getIsbn() < li2.getIsbn())
           return -1;
       else return 1;
    }
}
