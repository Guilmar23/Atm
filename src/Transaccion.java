/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinch
 */
public abstract class Transaccion {
    
    private int monto;
    
    public void ejecutar(int monto){
        System.out.println("Transaccion.ejecutar()");
    }
    
}
