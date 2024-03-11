/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author naote
 */
public class PessoaFisica extends Pessoa implements Serializable {
    private String cpf;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.printf("CPF: %s%n",this.cpf);
        System.out.printf("Idade: %d%n",this.idade);
    }
    public PessoaFisica(String nome, int id, String cpf, int idade){
        super(nome,id);
        this.cpf = cpf;
        this.idade = idade;
    }
}
