/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivergentChange;

/**
 *
 * @author Elena
 */
public class Num {
   // ...
    private int num1;
    private int num2;
    private String nombre;
    private String codigo;
    
    public Num(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
//    metodos que no pertenece en una clase solo para numeros
    public String getNombre(){
        return this.nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    
}
