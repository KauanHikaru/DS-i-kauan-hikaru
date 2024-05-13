/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

/**
 *
 * @author CAMARGO
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlunoObj aluno;
        
        aluno = new AlunoObj();
        
        aluno.setNome("Kauan");
        System.out.println(aluno.getNome());
        
        aluno.setIdade(16);
        System.out.println(aluno.getIdade());
    }
    
}
