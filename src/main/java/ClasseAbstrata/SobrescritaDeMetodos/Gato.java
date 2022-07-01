/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata.SobrescritaDeMetodos;

import ClasseAbstrata.Animal;

public class Gato extends Animal{
    
    /*
        Sobreescrita do método fala()
    */

    @Override
    public void fala() {   
        System.out.println(" miau miau miau");
    }
}
