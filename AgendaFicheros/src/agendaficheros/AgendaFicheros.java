/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaficheros;

import java.util.Scanner;
import menus.MenuPrincipal;

/**
 *
 * @author Juanfran
 */
public class AgendaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda("Catalin");
        System.out.println("Bienvenido a la agenda de telefonos");
        int opc = 0;
        Scanner leer = null;
        while(opc!=6){
            opc = menus.MenuPrincipal.menuPrincipal();
            switch(opc){
                case 1: 
                    leer = new Scanner(System.in);
                    System.out.println("Añadir contactos");
                    agenda.añadirContacto(new Contacto(leer.nextLine(), leer.nextLine()));
                    break;
                //2 - Borrar contacto
                case 2: 
                    leer = new Scanner(System.in);
                    System.out.println("Añadir contactos");
                    agenda.borrarContacto(leer.nextLine());
                    break;
                //3 - Editar Contacto
                    
                case 3: 
                    leer = new Scanner(System.in);
                    System.out.println("Dime el contacto que quieres editar");
                    agenda.editarContacto(leer.nextLine());
                    break;
                //4 - Mostrar contacto
                case 4: 
                    leer = new Scanner(System.in);
                    System.out.println("Que contacto quieres buscar");
                    agenda.mostrarContacto(leer.nextLine());
                    break;
                case 5: 
                    agenda.mostrarContactos();
                    break;
                case 6: 
                    System.out.println("Adios");
                    ioDatos.Fichero.guardarDatosDisco(agenda.getvAgenda());
                    break;
            }
        }
    }
    
}
