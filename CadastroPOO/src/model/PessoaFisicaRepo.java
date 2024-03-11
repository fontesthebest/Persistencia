/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static model.Serializacao.deserializarF;
import static model.Serializacao.serializarF;


/**
 *
 * @author naote
 */
public class PessoaFisicaRepo {
    private ArrayList<PessoaFisica> pessoasF= new ArrayList<>();

    public void inserir(PessoaFisica ...pessoas){
        this.pessoasF.addAll(Arrays.asList(pessoas));
    }
    
    public void alterar(PessoaFisica pessoa){
        int id = pessoa.getId();
        
        for (int i = 0; i < pessoasF.size(); i++) {
            if ( id == pessoasF.get(i).getId() ) {
                pessoasF.remove(i);
                pessoasF.add(i,pessoa);
            }
        }
    }
    
    public void excluir(int id){
        for (int i = 0; i < pessoasF.size(); i++) {
            if ( id == pessoasF.get(i).getId() ) {
                pessoasF.remove(i);
            }
        }
        
    }
    public void obter(int id){
        for (int i = 0; i < pessoasF.size(); i++) {
            if ( id == pessoasF.get(i).getId() ) {
                pessoasF.get(i).exibir();
            }
        }
        
    }
    public void obterTodos(){
        this.pessoasF.stream().map(e -> {
            e.exibir();
            return e;
        }).forEachOrdered(_item -> {
            System.out.println("--------------------------");
        });
    }
    
    public void persistir(String arquivo) throws IOException{
        serializarF(pessoasF,arquivo);
        System.out.println("Dados de Pessoa Fisica Armazenados");
    }
    
    public void recuperar(String arquivo) throws IOException, ClassNotFoundException{
        pessoasF = deserializarF(arquivo);
        System.out.println("Dados de Pessoa Fisica Recuperados");

    }
    
    public PessoaFisicaRepo(){
        
    }
    
}
