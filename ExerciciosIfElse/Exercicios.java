package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o 1° valor!");
        double valor1 = sc.nextDouble();

        System.out.println("Informe o 2° valor!");
        double valor2 = sc.nextDouble();

        if (valor1 > valor2) {
            System.out.println("O 1° valor é Maior" + valor1 + "!");

        } else {
            System.out.println("O 2° valor é Maior" + valor2 + "!");
        }
    }

    public void exercicio2() {

        System.out.println("Informe seu ano de nascimento");
        int anoNascimento = sc.nextInt();

        if (anoNascimento <= 2007) {
            System.out.println("Você - Cidadão registrado, está apto a votar!");
        } else {
            System.out.println("Você - Cidadão, não está apto a votar por não atingir o requisito minímo de idade!");
        }

    }

    public void exercicio3() {
        System.out.println("Olá, para obter acesso você precisa digitar uma senha!");

        System.out.println("Por favor, digite a Senha!");
        double senha = sc.nextDouble();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO!");
        } else {
            System.out.println("ACESSO NEGADO!");
        }
    }

    public void exercicio4() {

        System.out.println("Olá! Seja Bem-Vindo ao Hortifruti online!");
        System.out.println("Por favor, digite quantas maçãs gostaria de comprar!");
        double maças = sc.nextDouble();

        if (maças >= 12) {
            System.out.println("O preço por unidade de maçã será de R$0,25 e o preço total será de " + (maças * 0.25));
        } else {
            System.out.println("O preço por unidade de maçã será de R$0.30 e o preço total será de" + (maças * 0.35));
        }
        System.out.println(
                "Por favor, digite novamente quantas maças gostaria de comprar, e se assim é possível obter desconto!");
        double quantidade = sc.nextDouble();

        if (quantidade >= 30) {

            System.out.println(
                    "Parabéns, Você obteve 2% de desconto, mas deve calcular por conta própria porquê o tempo está limitado para eu ir além! :)");

        } else {
            System.out.println(
                    "Infelizmente Você não comprou o minímo de maças para obter um Desconto especial, Por favor, compre mais!");

        }

    }

    public void exercicio5() {
        System.out.println("Por favor, Digite 3 valores para que eu os classifique em ordem Crescente!");
        int x = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((x < b) && (x < c)) {
System.out.println("A ordem crescente dos números é" + x + b + c);
    }else {
        System.out.println("");
    }
    
    if ((x < c) && (x < b)) {
        System.out.println("A ordem crescente dos números é" + x + c + b);
            }else {
                System.out.println("");
            }

            if ((b < c) && (b < x)) {
                System.out.println("A ordem crescente dos números é" + b + c + x);
                    }else {
                        System.out.println("");
                    }
                    if ((b < x) && (b < c)) {
                        System.out.println("A ordem crescente dos números é" + b + x + c);
                            }else {
                            System.out.println("");

                            }

                        }
    

    public void exercicio6() {

    }

}
