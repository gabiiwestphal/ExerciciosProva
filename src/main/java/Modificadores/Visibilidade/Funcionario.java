/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modificadores.Visibilidade; //EXEMPLO FUNCIONARIO

public class Funcionario {
    
    public String nome;
    
    /* 
    Acessível de qualquer local.   
    */
    
    private int codigo;
    
    /*Acessível apenas nessa classe. Para acessar de outro local
    será necessário implementar os métodos get e set. 
    Esses atributos e métodos também não podem ser visualizados pelas classes herdadas.
    */
    
    protected String CPF;
    
    /*
    O modificador protected torna o membro acessível às classes do mesmo pacote 
    ou através de herança, outras classes não tem acesso.
    */

    public Funcionario(String nome, int codigo, String CPF) { 
        this.nome = nome;
        this.codigo = codigo;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
        
}
