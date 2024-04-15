package aula01;

import java.util.Scanner;

public class Calculadoraimc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float peso;
        float altura;
        String nome;
        String classificação; 

        System.out.println("Insira seu nome.");
        nome = scan.nextLine();

        System.out.println("Insira seu peso.");
        peso = scan.nextFloat();

        System.out.println("Insira sua altura.");
        altura = scan.nextFloat();

        float imc = peso/(altura*altura);

        if (imc < 18.5) {
            classificação = "Magreza";
        } else if (imc < 25) {
            classificação = "Normal";
        } else if (imc < 30) {
            classificação = "Sobrepeso";
        } else {
            classificação = "Obeso grau 2";
        }

        System.out.println(nome + " você está classificado como " + classificação);
    }
    
}
