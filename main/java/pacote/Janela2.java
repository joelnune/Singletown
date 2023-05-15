/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Janela2 {
    private static Janela2 instancia;
    
    private Janela2(){
    }
    
    public static synchronized Janela2 getInstance(){
    if (instancia == null){
        instancia = new Janela2();
    }
    return instancia;
    }
}
