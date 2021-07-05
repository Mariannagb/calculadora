package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("\n\nCalculadora de Visualizações - Agência Divulga Tudo");
            System.out.println("\n---------------------------------------------------\n");
            System.out.println("1 - Calcular Visualizações");
            System.out.println("2 - Sair da calculadora");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("Qual será o valor investido? Use vírgula para separar os números decimais");
                float valor = leitor.nextFloat();
                float visAntes = valor * 30;
                float visDepois = 0;
                for (int i = 0; i < 4; i++) {
                    float cliques = visAntes * 0.12f;
                    float compartilhamentos = cliques * 0.15f;
                    visDepois = visAntes + (compartilhamentos * 40);
                    visAntes = visDepois;
                }
                System.out.println("A quantidade de visualizações esperada é de " + Math.round(visDepois));
            }
            if (opcao == 2) {
                System.out.println("Adeus!!!");
            }
        } while (opcao != 2);
    }
}