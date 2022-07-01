/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instanceof;

import java.util.ArrayList;
import java.util.List;

public class MainInstanceof {
    
    public static void main(String[] args){
        Funcionario mattheus = new Funcionario("Mattheus", "4567", "Engenheiro de Software");
    
        if(mattheus instanceof Pessoa){
            System.out.println(mattheus.getNome() + " é uma pessoa");
        }
        if (mattheus instanceof Funcionario){
            System.out.println(mattheus.getNome() + " é um Funcionario");
        }
        Pessoa marilia = new Pessoa("Marília", "123456");
     
        
        //Usando instanceof com listas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(marilia);
        pessoas.add(mattheus);
    }
}
