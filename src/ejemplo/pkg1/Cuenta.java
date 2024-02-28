/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg1;

/**
 *
 * @author kinch
 */
public class Cuenta implements Serealizable {
    private float saldo;
    private float saldoFlotante;
    private int numeroDeCuenta;
    private int nip;
    //VARIABLES 
    
    Cuenta(String nombre) {
            System.out.println("Hola " + nombre);
            
    }//constructor = mismo nombre de la clase
    
    public Cuenta(float saldo, float saldoFlotante, int numeroDeCuenta, int nip){
        this.saldo = saldo;
        this.saldoFlotante = saldoFlotante;
        this.numeroDeCuenta = numeroDeCuenta;
        this.nip = nip;
    }
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000){
        }
        else
            System.out.println("El numero de cuenta no existe");
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    
    
    int obtenerSaldo(int numeroDeCuenta) {return 0;} {//para quitar el error (return 0;)
    System.out.println("Cuenta.obtenerSaldo(String, int)");
}
   // int obtenerSaldo(int +1, String ) {return 0;} {
    //System.out.println("Cuenta.obtenerSaldo(String, int)");
}
    
    //void acreditar(int monto) {}
    //void debitar(int monto) {}
    //METODOS
    //dentro del parentesis PARAMETROS

