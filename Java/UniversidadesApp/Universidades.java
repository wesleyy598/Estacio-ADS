/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadesapp;

import java.util.ArrayList;

/**
 *
 * @author viTs
 */
public class Universidades {
   private ArrayList<Object> universidades;

    public Universidades(){
        universidades = new ArrayList<Object>(); 
    }
    public void addUniversidade(UniversidadeSede uni){
        if (uni!=null) {
            universidades.add(uni);
            System.out.println("Universidade "+ uni.getNome() + "adicionada com sucesso!" );
        }else{
            System.out.println("Universidade inválida tente novamente");
        }
    }
    public void addUniversidade(UniversidadePolo uniPolo){
        if (uniPolo!=null) {
            universidades.add(uniPolo);
            System.out.println("Universidade "+ uniPolo.getNome() + "adicionada com sucesso!" );
        }else{
            System.out.println("Universidade inválida tente novamente");
        }
    }

    public void addUniversidade(UniversidadeInterior uniInterior){
        if (uniInterior!=null) {
            universidades.add(uniInterior);
            System.out.println("Universidade "+ uniInterior.getNome() + "adicionada com sucesso!" );
        }else{
            System.out.println("Universidade inválida tente novamente");
        }
    }
    
   
    public ArrayList<Object> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(ArrayList<Object> universidades) {
        this.universidades = universidades;
    }
}
