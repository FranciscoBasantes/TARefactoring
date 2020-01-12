/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedRequest;

/**
 *
 * @author Elena
 */
public class peces extends animal {
    @Override
    public void saltar() {
        throw new IllegalStateException("los peces no saltan");   
    }
}
