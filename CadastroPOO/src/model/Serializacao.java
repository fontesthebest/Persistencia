/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author naote
 */
public class Serializacao {
    public static void serializarF(ArrayList pessoas, String arquivo) throws IOException{
        Path path = Paths.get(arquivo);
        try(ObjectOutputStream oos= new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(pessoas);
        }catch(IOException e){
            System.out.println(e);
    }
    }
    public static void serializarJ(ArrayList pessoas, String arquivo) throws IOException{
        Path path = Paths.get(arquivo);
        try(ObjectOutputStream oos= new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(pessoas);
        }catch(IOException e){
            System.out.println(e);
    }
    }
    
    public static ArrayList deserializarF(String arquivo) throws IOException, ClassNotFoundException{
        Path path = Paths.get(arquivo);
        ArrayList<PessoaFisica> pessoasF= new ArrayList<>();
        try(ObjectInputStream ois= new ObjectInputStream(Files.newInputStream(path))){
            pessoasF= (ArrayList) ois.readObject();
            
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e);
    }
        return pessoasF;
    }
    
    public static ArrayList deserializarJ(String arquivo) throws IOException, ClassNotFoundException{
        Path path = Paths.get(arquivo);
        ArrayList<PessoaJuridica> pessoasJ= new ArrayList<>();
        try(ObjectInputStream ois= new ObjectInputStream(Files.newInputStream(path))){
            pessoasJ= (ArrayList) ois.readObject();
            
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
        return pessoasJ;
    }
}
