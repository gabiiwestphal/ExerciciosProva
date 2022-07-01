/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

public class Funcionario implements Autenticavel, Salario{
     
    String nome;
    String salário;
    String cargo;
    String codigoFuncionario;
    double salario = 2000;

    public Funcionario(String nome, String salário, String cargo, String codigoFuncionario) {
        this.nome = nome;
        this.salário = salário;
        this.cargo = cargo;
        this.codigoFuncionario = codigoFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalário() {
        return salário;
    }

    public void setSalário(String salário) {
        this.salário = salário;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public boolean autentica(String senha) {
        if (senha.equals(getCodigoFuncionario()))
            return true ;
                    else 
            return false;
    }
    @Override
    public double calcularSalario(int dias) {
        return this.salario * dias;
    } 
}
      

