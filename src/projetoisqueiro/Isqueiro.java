
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
public class Isqueiro {
    float tamanho;
    String cor;
    String marca;
    boolean aceso;
//    boolean apagado;
    
    
    void status(){
        System.out.println("O tamanho do Isqueiro "+this.marca+" é " + this.tamanho + " centímetros");
        System.out.println("Ele é de cor " + this.cor);
        System.out.println("a marca é " + this.marca);
        System.out.println("E o isqueiro está aceso? " + this.aceso);
        System.out.println("-----------------------------------");
    }//Alterado da Web
  
    void aceso(){
        this.aceso = true;
    }    
    void apagado(){
        this.aceso = false;
        
  }      
    void guardar(){
        if(this.aceso==true){
            System.out.println("O isqueiro "+this.marca+" está aceso e não posso guardar");
        }else{
            System.out.println("O isqueiro "+this.marca+" está apagado já posso guardar");
        }
    }
        
}
        
        
 
        
    
