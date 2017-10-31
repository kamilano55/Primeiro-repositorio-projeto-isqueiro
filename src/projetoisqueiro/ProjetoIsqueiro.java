/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoisqueiro;

/**
 *
 * @author Pretinho
 */
public class ProjetoIsqueiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Isqueiro i = new Isqueiro();
        i.tamanho = 10.5f;
        i.cor = "Preta";
        i.marca = "Bic";
        i.aceso = true;
        
        Isqueiro i2 = new Isqueiro();
        i2.tamanho = 5.0f;
        i2.cor="prata";
        i2.marca="zennite";
        i2.aceso=false;
        
        i.aceso();
//        i.apagado();
        i.guardar();
        i.status();
        
        
        
//        i2.aceso();
        i2.apagado();
        i2.guardar();
        i2.status();
        
        
    }   
        
        
    
}
