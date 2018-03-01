/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmmmtesting;

import controller.PerroController;
import java.util.Scanner;
import model.Perro;

/**
 *
 * @author hmateo
 */
public class HmmmTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option = -1;
        PerroController pc = new PerroController();
        Perro p = pc.perroPorDefecto();
        while (option !=0){
            System.out.println("##### Gestión de Perros Virtuales #####");
            System.out.println("[1] Nuevo Perro");
            System.out.println("[2] Consultar acciones realizadas por el Perro");
            System.out.println("[3] Haz que el Perro cante");
            System.out.println("[4] Sentar al Perro");
            System.out.println("[5] Haz que el Perro ladre");
            System.out.println("[0] Salir");
            System.out.println("#####################################");
            Scanner sc = new Scanner(System.in);
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            switch(option){
                case 2:
                    pc.consultarAccionesPerro(p);
                    break;
                case 3:
                    pc.cantar(p);
                    break;
                case 4:
                    pc.sentar(p);
                    break;
                case 0:
                    System.out.println("¡Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción no soportada");
            }
        }
    }
    
}
