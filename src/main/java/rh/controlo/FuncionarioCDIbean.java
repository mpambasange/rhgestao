/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh.controlo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import rh.modelo.Funcionario;

/**
 *
 * @author manuelpambasangejorge
 */
@Named(value = "funcionarioMbean")
@RequestScoped
public class FuncionarioCDIbean {
    
    Funcionario funcionario = new Funcionario ();
    Funcionario funcionario1 = new Funcionario ("Manuel", "Jorge", "MEI", 31, 25000);
    Funcionario funcionario2 = new Funcionario ("Joaquim", "Hangalo", "SDomingos", 40, 100000);
    Funcionario funcionario3 = new Funcionario ("Mel", "Jorge", "Caixa Angola", 32, 50000);
    
   
    List<Funcionario> funcionarios = new ArrayList<>();
    
    /**
     *
     */
    //Funcionario(String nome, String sobrenome, String departamento, int idade, double salario)

    @PostConstruct
    public void iniciar(){
        
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
    
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
   

    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
   
    public String guardar() {
        return "resultado";
    }
    
    public String salvar() {
         
         funcionarios.add(funcionario);
         funcionario = new Funcionario();
         return "listafuncionario";
    }
    
    

}
