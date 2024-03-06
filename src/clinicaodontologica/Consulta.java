/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaodontologica;

/**
 * Uma consulta é um encontro entre um dentista e um paciente
 * em uma data e hora para realização de um serviço por um preço.
 * @author 85477044349
 */
public class Consulta {
    
    private Paciente paciente;
    private Dentista dentista;
    private String data;
    private String hora;
    private String servico;
    private float preco;

    public Consulta(Paciente paciente, Dentista dentista, String data, 
            String hora, String servico, float preco) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.data = data;
        this.hora = hora;
        this.servico = servico;
        this.preco = preco;
    }    
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
