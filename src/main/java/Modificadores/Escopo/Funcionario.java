/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modificadores.Escopo; //EXEMPLO FUNCIONARIO

public class Funcionario {
    
    /*quando instanciada, a variável será a mesma em todas.
    não precisa instanciar um objeto para ter acessar o método,
    */
    
    public static int gerarId = 0;
    private int identificador;

    public Funcionario(int identificador) { 
        identificador = ++gerarId;
    }

    public int getIdentificador() {
        return identificador;
    }    
}
