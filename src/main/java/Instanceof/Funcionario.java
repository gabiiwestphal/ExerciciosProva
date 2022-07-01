/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instanceof;

public class Funcionario extends Pessoa{
    
    private String cargo;
    
    public Funcionario(String nome, String CPF, String cargo) {        
    
        super(nome, CPF);
        this.cargo = cargo;      
    }
    
    @Override
    public void imprimeDados(){

        super.imprimeDados();
        System.out.println(cargo);
    }
}
