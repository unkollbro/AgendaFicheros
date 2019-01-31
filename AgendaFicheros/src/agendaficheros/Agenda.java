/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaficheros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juanfran
 */
public class Agenda {
    
    private String propietario;
    private ArrayList<Contacto> vAgenda;

    public Agenda(String nombre) {
        this.propietario = nombre;
        vAgenda = ioDatos.Fichero.cargarDatos();
    }
    
    public void añadirContacto(Contacto contacto){
        vAgenda.add(contacto);
    }
    
    public void mostrarContacto(String nombre){
        for (Contacto contacto : vAgenda) {
            if(nombre.equalsIgnoreCase(contacto.getNombre())){
                System.out.println(contacto);
            }
        }
    }
    
    public void mostrarContactos(){
        for (Contacto contacto : vAgenda) {
            System.out.println(contacto);
        }
    }
    
    public void borrarContacto(String dato){
        Iterator<Contacto> it = vAgenda.iterator();
        while(it.hasNext()){
            Contacto c = it.next();
            if(c.getNombre().equalsIgnoreCase(dato) || c.getTelefono().equalsIgnoreCase(dato)){
                it.remove();
            }
        }
    }
    
    public void editarContacto(String dato){
        Iterator<Contacto> it = vAgenda.iterator();
        Scanner leer = new Scanner(System.in);
        while(it.hasNext()){
            Contacto c = it.next();
            if(c.getNombre().equalsIgnoreCase(dato) || c.getTelefono().equalsIgnoreCase(dato)){
                System.out.println("Introduce el nombre");
                c.setNombre(leer.nextLine());
                System.out.println("Introduce el telefono");
                c.setTelefono(leer.nextLine());
            }
        }
    }

    public ArrayList<Contacto> getvAgenda() {
        return vAgenda;
    }
    
    
    
}
