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
public class Pessoa implements Serializable{
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibir(){
        System.out.printf("Id: %d%n",this.id);
        System.out.printf("Nome: %s%n",this.nome);
    }
    
    public Pessoa(String nome,int id){
        this.nome=nome;
        this.id=id;
    }
}
