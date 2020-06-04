/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjuni;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Tugasjuni {

    /**
     * @param args the command line arguments
     */
    public static void main(String  [] args) {
        int n = 0;
        try {
            n = System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Tugasjuni.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hasil : "+(char) n);
    }
    
}
