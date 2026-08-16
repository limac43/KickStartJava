package Aula25;

import java.util.Scanner;

public class Exercício {

    public static void main (String[] args) {

//        Como declarar uma matriz

//        Tipo de Dado [] [] nomeVariavel = {linha 0 {coluna 0},linha 1{coluna 1}};
//        Tipo de Dado [][] nomeVariavel = new [linha ][coluna]


//       Desenho da Interface
        System.out.println("-------------------MAPA DO TESOURO---------------------");
        System.out.println(" - 0 1 2 ");
        System.out.println(" 0 * * *");
        System.out.println(" 1 * * * ");
        System.out.println(" 2 * * * ");
        System.out.println("-------------------------------------------------------");


//      Criando a matriz
        boolean[][] mapaTesouro = new boolean[3][3];
        mapaTesouro[1][2] = true;

        //      Utilizando o sacnner para leitura dos inputs
        Scanner sc = new Scanner(System.in);

        boolean encontrouTesouro = false;

        while (!encontrouTesouro) {

            System.out.println("-------------------------------------------------------");
            System.out.println("Onde está o tersouro? Digite a Linha:");
            int x = sc.nextInt();
            sc.nextLine();

            System.out.println("Onde está o tersouro? Digite a Coluna:");
            int y = sc.nextInt();
            sc.nextLine();


            if (mapaTesouro[x][y] == false) {

                System.out.println("Você errou! Tente novamente..");

            } else {

                encontrouTesouro = true;
                System.out.println("Parabéns você encontrou o tesouro!!");
            }
        }
    }

}
