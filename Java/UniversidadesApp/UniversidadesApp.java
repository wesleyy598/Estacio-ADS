/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadesapp;

/**
 *
 * @author viTs
 */
public class UniversidadesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniversidadeSede uniSede = new UniversidadeSede();
        uniSede.setNome("Estacio Rio de Janeiro");
        uniSede.setLocalizacao("Rio de Janeiro");
        
        UniversidadePolo uniPolo = new UniversidadePolo();
        uniPolo.setNome("Estacio Salvador");
        uniPolo.setLocalizacao("Salvador");
        uniPolo.setQteAlunos(2598);
        
        UniversidadeInterior uniInterior = new UniversidadeInterior();
        uniInterior.setLocalizacao("Feira de Santana");
        uniInterior.setNome("Estacio de feira");
        uniInterior.setLucro(50000);
        
        Universidades universidades = new Universidades();
        
        universidades.addUniversidade(uniInterior);
        universidades.addUniversidade(uniPolo);
        universidades.addUniversidade(uniSede);
        
    }
    
}
