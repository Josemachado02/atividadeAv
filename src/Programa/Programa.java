package Programa;

import java.util.Scanner;

import Classes.Contato;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contato contato = new Contato();
        contato.setNome("jose");

        int opcao = -1;

        while (opcao != 0){
            exibirmenu();
            opcao = ler.nextInt();
        }

        switch(opcao) {
            case 0:
            System.out.println("Saindo... \nEspero ter ajudado!!");
              return;
            case 1:
            cadastrar();
              break;

            case 2:
            pesquisar();
              break;
            
            case 3:
            exibirContato();
              break;
              default:
              System.out.println("essa opção é invalida!");
        }
        ler.close();  


    }
   
    
    
    
    private static void cadastrar() {
        
    }

    private static void pesquisar() {

    }

    private static void exibirContato() {
        
    }



    private static void exibirmenu() {
        System.out.println("----- AGENDA ELETRONICA -----");
        System.out.println("Olá, o que deseja fazer entre as opções abaixo:");
        System.out.println("1 - Cadastrar contatos:");
        System.out.println("2 - Pesquisar contatos:");
        System.out.println("3 - Exibir todos os contatos");
        System.out.println("0 - Sair");
    }

    
    
}
