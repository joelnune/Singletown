/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author FATEC ZONA LESTE
 */
public final class Janela {
    
    public static final Janela INSTANCE = new Janela();
    public static final String Teste = "Exemplo singleton Private";
    
    public static final String Singletown = "Exemplo Singleton Publico";

    private Janela(){}
    
    public static Janela getInstance(){
    return INSTANCE;
    }
    
    public static void Abrir(){
        System.out.println("Abrir Janela");
    }
    
    public static void Fechar(){
        System.out.println("Fechar Janela");
    }
}
