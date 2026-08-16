package Aula25;

import java.util.Scanner;
public class Matrizes {

    public static void main (String[] args){
//        Introdução ao sistema
        System.out.println("# GOOGLE - AGENDAS CLI #");

//      Scanner para leitura dos dados
        Scanner sc = new Scanner(System.in);

//        Declarar a matriz que deve ser o mês
        String [][] agenda = new String[5][8];

//        Criando um indice para dia da semana e vinculando a uma string para semana
        for (int dia = 0; dia <5; dia++ ){

            String diaSemana = "";
            switch (dia){
                case 0:
                    diaSemana = "Segunda" ;
                    break;
                case 1:
                    diaSemana = "Terça" ;
                    break;
                case 2:
                    diaSemana = "Quarta" ;
                    break;
                case 3:
                    diaSemana = "Quinta" ;
                    break;
                case 4:
                    diaSemana = "Sexta" ;
                    break;
            }

            System.out.println("Quer cadastrar tarefas para "+ diaSemana +"?");
            String tarefaSemana = sc.nextLine();

            if (tarefaSemana.equalsIgnoreCase("sim")){

                for (int tarefa = 0; tarefa < 8 ; tarefa++){
                    System.out.println("Digite o nome da tarefa " + (tarefa + 1) + "/8 ou 'Finalizar':");

                    String nomeTarefa = sc.nextLine();

                    if (nomeTarefa.equalsIgnoreCase("finalizar")){
                        break;
                    }else {
                        agenda [dia][tarefa] = nomeTarefa;
                    }
                }


            }

        }

        System.out.println("Agenda finalizada!");

        for(int i = 0; i < 5; i++ ) {

            String diaSemana = "";
            switch (i) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terça";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
            }
                System.out.println("Agenda para " + diaSemana);

                for (int j = 0; j < 8; j++) {

                    if (agenda [i][j] != null) {
                        System.out.println("-" + agenda[i][j]);
                    }

                }
            }
        }
    }
