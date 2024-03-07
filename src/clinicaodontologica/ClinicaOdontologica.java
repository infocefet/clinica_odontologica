                 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicaodontologica;

/**
 *
 * @author 85477044349
 */
public class ClinicaOdontologica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        //Criação/instanciação de um objeto da classe Dentista
        Dentista objetoDentista = new Dentista(1, "Dr. Edson");
        objetoDentista.setEspecialidade("Ortodontia");
        
        Dentista objetoDentista2 = new Dentista(2, "Dra. Larissa");
        objetoDentista2.setEspecialidade("Ortodontia");
        
        Paciente paciente = new Paciente("Airton");
        paciente.setEmail("airton@sena.com.br");
        
        Paciente p2 = new Paciente("José");
        
        Consulta consulta = new Consulta(paciente, objetoDentista,
                "10/03/24", "10h", "canal", 500);
    }
    
}
