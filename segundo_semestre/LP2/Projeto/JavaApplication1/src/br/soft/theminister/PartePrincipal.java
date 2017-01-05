/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.soft.theminister;

import java.util.logging.Logger;
import javax.swing.JFrame;


public class PartePrincipal extends JFrame{	         
    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(PartePrincipal.class.getName());

    public static void main(String[] args) {
        PartePrincipal ag = new PartePrincipal();
    }
        private  PartePrincipal pp;
        
	private Cliente cliente;

    public PartePrincipal() {
        Tela t1;
        t1 = new Tela(this.pp);
    }    

    PartePrincipal(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
