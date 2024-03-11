/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static model.Serializacao.deserializarJ;
import static model.Serializacao.serializarJ;

/**
 *
 * @author naote
 */
public class PessoaJuridicaRepo {
    private  ArrayList<PessoaJuridica> pessoasJ = new ArrayList<>();

    public void inserir(PessoaJuridica ...pessoas){
        this.pessoasJ.addAll(Arrays.asList(pessoas));
    }
    
    public void alterar(PessoaJuridica pessoa){
        int id = pessoa.getId();
        
        for (int i = 0; i < pessoasJ.size(); i++) {
            if ( id == pessoasJ.get(i).getId() ) {
                pessoasJ.remove(i);
                pessoasJ.add(i,pessoa);
            }
        }
    }
    
    public void excluir(int id){
        for (int i = 0; i < pessoasJ.size(); i++) {
            if ( id == pessoasJ.get(i).getId() ) {
                pessoasJ.remove(i);
            }
        }
    }
    public void obter(int id){
        for (int i = 0; i < pessoasJ.size(); i++) {
            if ( id == pessoasJ.get(i).getId() ) {
                pessoasJ.get(i).exibir();
            }
        }
    }
    public void obterTodos(){
        this.pessoasJ.stream().map(e -> {
            e.exibir();
            return e;
        }).forEachOrdered(_item -> {
            System.out.println("--------------------------");
        });
    }
    
    public void persistir(String arquivo) throws IOException{
        serializarJ(pessoasJ,arquivo);
        System.out.println("Dados de Pessoa Juridica Armazenados");

    }
    
    public void recuperar(String arquivo) throws IOException, ClassNotFoundException{
        pessoasJ = deserializarJ(arquivo);
        System.out.println("Dados de Pessoa Juridica Recuperado");

    }
    public PessoaJuridicaRepo(){
        
    }
}
