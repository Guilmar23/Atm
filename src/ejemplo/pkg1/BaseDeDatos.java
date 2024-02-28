/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kinch
 */
public class BaseDeDatos {
    
    private File fileObj = new File("cuentas.txt");
    
    public void escribir(){
        try {
            FileWriter fw = new FileWriter(fileObj);
            fw.write("Vamos donde las cariñosas Goku ");
            fw.write("Que bendicion");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   // public void leer(){
        
       // FileReader fr = new FileReader
             
    
    }
