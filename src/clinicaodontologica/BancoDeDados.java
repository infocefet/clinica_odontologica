/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaodontologica;

import java.util.ArrayList;

/**
 *
 * @author 85477044349
 */
public class BancoDeDados {
    
    
    //Lista de Objetos em JAVA - ArrayList
    private ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>() ;
    private ArrayList<Dentista> listaDentistas = new ArrayList<Dentista>() ;
    
    public void addPaciente(Paciente paciente)
    {
        listaPacientes.add(paciente);
    }
    
    public void addDentista(Dentista dentista)
    {
        listaDentistas.add(dentista);
    }
    
}
