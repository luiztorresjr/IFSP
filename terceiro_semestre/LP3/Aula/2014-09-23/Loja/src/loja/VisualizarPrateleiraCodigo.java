/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loja;

import java.util.Collections;

/**
 *
 * @author a1320742
 */
public class VisualizarPrateleiraCodigo extends VisualizarPrateleira{
        public void mostrarProdutos(Prateleira pratel){
            
            //Em ordem crescente;
            Collections.sort(pratel);
            
            //Em ordem decrecente;
           Collections.reverse(pratel);
           
           //Qual o Critério?
            super.mostrarProdutos(pratel);
        }
}
