/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColegioClases;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();
    // materia es el cuarto atibuto = inscripcion = agregar materia

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getListaAl() {
        return materias;
    }

    public void setListaAl(HashSet<Materia> listaAl) {
        this.materias = listaAl;
    }

    public boolean agregarMateria(Materia m) {
        return materias.add(m);
//     if(materias.add(m) == true){
//         JOptionPane.showMessageDialog(null, "Inscripción de alumno exitosa");
//     } else{
//         JOptionPane.showMessageDialog(null, " Alumno ya inscripto");
//     }
// este fragmento de codigo esta comentado porque afecta el Main Colegio
// al momento de ver por consola el resultado de la pruebas
    }

    public int cantindadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return (apellido + " " + nombre);
    }

}
