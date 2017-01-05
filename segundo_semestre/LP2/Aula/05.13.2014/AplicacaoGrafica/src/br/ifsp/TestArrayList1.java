/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author a132067x
 */
public class TestArrayList1 {
    private static String[] naipes = {"Espada","Copas", "Ouros","Paus"};
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main (String[] args){
        ArrayList al1 = new ArrayList(Arrays.asList(naipes));
        System.out.println("Elementos do ArrayList, não ordenados:"+al1);
        Collections.sort(al1);
        System.out.println("Elementos do ArrayList ordenados:"+al1);
    }
}
