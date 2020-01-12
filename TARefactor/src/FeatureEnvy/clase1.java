/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy;

/**
 *
 * @author Elena
 */
public class clase1 {
    private int atributo1;
    private int atributo2;

    public int getAtributo1() {
        return atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }
//   metodo corregido en clase1
    public int sumar() {
        int num = getAtributo1() + getAtributo2();
        return num;
    }
}
