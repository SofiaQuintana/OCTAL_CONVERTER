/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import java.io.StringReader;
import java.util.Scanner;
import lexer.OctalLexer;
import parser.OctalParser;

/**
 *
 * @author zofia
 */
public class MenuDriver {
    private OctalLexer lexer;
    private OctalParser parser;
    private Scanner scanner;

    public MenuDriver(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void principalMenu() throws Exception {
        int option = 0;
        while(option != 2) {
            System.out.println("###### Conversor de octal a decimal ######");
            System.out.println("# [1] Conversion");
            System.out.println("# [2] Salir");
            System.out.println("\n# Ingrese opcion [1-2]");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    convertionMenu();
                break;
                case 2:
                    System.exit(0);
                break;
            }
        }
    }
    
    private void convertionMenu() throws Exception {
        String octal;
        System.out.println("\n# Ingrese valor octal a convertir: ");
        octal = scanner.next();
        this.lexer = new OctalLexer(new StringReader(octal));
        this.parser = new OctalParser(lexer);
        parser.parse();
    }
}
