/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kinch
 */
public class BaseDeDatosSerealizada {
    
    public void escribir(){
        
        Path pathObj = Paths.get("cuentas_serealizadas.bin");
        
        try {
            OutputStream outputstreamObj = Files.newOutputStream(pathObj);
            ObjectOutputStream object0utputStreamObj = new ObjectOutputStream(outputstreamObj);
            
            Cuenta c1 = new Cuenta (100.00f, 00f, 12345, 54321);
            Cuenta c2 = new Cuenta (150.00f, 50f, 23456, 65432);
            
            objectOutputStreamObj.writeObject(c1);
            objectOutputStreamObj.writeObject(c2);
            
            object0utputStreamObj.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatosSerealizada.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
