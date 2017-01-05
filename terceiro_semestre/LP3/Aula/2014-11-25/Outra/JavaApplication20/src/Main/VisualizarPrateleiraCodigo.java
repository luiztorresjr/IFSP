/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.util.Collections;

/**
 *
 * @author a1320742
 */
public class VisualizarPrateleiraCodigo extends VisualizarPrateleira{
        public void mostrarProdutos(Prateleira prat){
            
            //Em ordem crescente;
            Collections.sort(prat.getPrateleira());
            
            //Em ordem decrecente;
           Collections.reverse(prat.getPrateleira());
           
        }
}
