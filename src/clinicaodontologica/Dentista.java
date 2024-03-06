/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaodontologica;

/**
 * Primeiro Pilar da OO:
 * 1. Encapsulamento de dados: significa tornar os atributos privados e criar 
 * métodos públicos do tipo GET (para obter o valor de um atributo) e SET para
 * alterar o valor de um atributo.
 *    - Construtor: é um método especial pq ele serve pra criar/instanciar 
 *                  um objeto de uma classe
 *    => ele tem o mesmo nome da classe obrigatoriamente
 *    => ele não tem tipo de retorno escrito
 *    => pra chamar o construtor usamos o operador new seguido do nome do construtor
 *       e da lista de parâmetros se houver.
 * @author 85477044349
 */
public class Dentista {
    
    private int CRO;
    private String nome;
    private String especialidade;
    
    public Dentista(int CRO, String nome)
    {
        this.CRO = CRO;
        this.nome = nome;
        this.especialidade = "";
    }
    public int getCRO() {
        return CRO;
    }

    public void setCRO(int CRO) {
        this.CRO = CRO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

   
    
}
