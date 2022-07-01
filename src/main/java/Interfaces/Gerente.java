/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

public class Gerente implements Autenticavel, Salario{
    
    String responsavelPorArea;
    String cartaoAdm;
    double salario = 3000;

    public Gerente(String responsavelPorArea, String cartaoAdm) {
        this.responsavelPorArea = responsavelPorArea;
        this.cartaoAdm = cartaoAdm;
    }

    public String getResponsavelPorArea() {
        return responsavelPorArea;
    }

    public void setResponsavelPorArea(String responsavelPorArea) {
        this.responsavelPorArea = responsavelPorArea;
    }

    public String getCartaoAdm() {
        return cartaoAdm;
    }

    public void setCartaoAdm(String cartaoAdm) {
        this.cartaoAdm = cartaoAdm;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     

    @Override
    public boolean autentica(String senha) {
        if (senha.equals(getCartaoAdm()))
            return true;
        else
            return false;
    }

    @Override
    public double calcularSalario(int dias) {
        return this.salario * dias;
    }    
}
