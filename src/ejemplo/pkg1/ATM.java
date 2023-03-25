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
public class ATM { 
    private RanuraParaDepositos ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj; 
    
public ATM(){ //contructor
    this.ranuraParaDepositosObj = new RanuraParaDepositos();
    this.tecladoNumericoObj = new TecladoNumerico();
    this.pantallaObj = new Pantalla();
    this.dispensadorObj = new Dispensador();
    
    this.solicitarDatos();
}
    
private void solicitarDatos(){
    pantallaObj.mostrarMensaje("Bienvenido");
    pantallaObj.mostrarMensaje("Ingrese su numero de cuenta");
    pantallaObj.mostrarMensaje("Ingrese su numero de NIP");
    int numeroCuenta = tecladoNumericoObj.capturarDatos();
  
    }

}
