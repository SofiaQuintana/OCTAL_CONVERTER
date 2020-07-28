/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Driver.MenuDriver;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zofia
 */
public class OctalConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        MenuDriver menu = new MenuDriver(scanner);
        try {
            menu.principalMenu();
        } catch (Exception ex) {
            Logger.getLogger(OctalConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
