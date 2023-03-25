/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg1;

import java.util.Scanner;

/**
 *
 * @author kinch
 */
public class TecladoNumerico {
    
    private Scanner scan;
    
    public TecladoNumerico(){
        scan = new Scanner(System.in);
    }
    
    public int capturarDatos(){
        return scan.nextInt();
    }

}
