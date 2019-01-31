/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import agendaficheros.Contacto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Fichero {
    public static ArrayList<Contacto> cargarDatos(){
        ArrayList<Contacto> vAgenda = new ArrayList();
        Scanner leer = null;
        File fichero = null;
        
        fichero = new File("agenda.txt");
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                //Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al crear fichero");
            }
        }
        try {
            leer = new Scanner(fichero);
            while(leer.hasNext()){
                String dato = leer.nextLine();
                String aux[] = dato.split("-");
                Contacto c = new Contacto(aux[0], aux[1]);
                vAgenda.add(c);
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha encontrado el fichero");
        }
        
        return vAgenda;
    }
    
    public static void guardarDatosDisco(ArrayList<Contacto> vAgenda){
        File f = null;
        FileWriter fw = null;
        PrintWriter pw = null;
    }
}
