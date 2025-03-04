package content;
import java.util.Scanner;


public class TesteVetor {
    // Atributo da classe
    static Scanner scanner;
    static int menu() {
        System.out.println("\nEscolha: ");
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Exibir");
        System.out.println("0 - Sair");
        return scanner.nextInt();
    }


    public static void main(String[] args) { // String args[] é uma outra maneira de escrever
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(4);
        scanner = new Scanner(System.in);
        // // v1.ocupacao = 23; atributo private, não pode ser acessado
        // int i = 10;
        // while (!v2.estaCheio()){
        // //System.out.println(i);
        // v2.insere(i++);
        // }
        // System.out.println(v2);
        // System.out.println();
        // while(!v1.estaCheio()){
        // v1.insere(++i);
        // //System.out.println(i);
        // }
        // System.out.println(v1);
        int opcao = menu();
        while (opcao > 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    v1.insere(scanner.nextInt());
                    break;
                case 2:
                    if (!v1.estaVazio())
                        System.out.println(v1.remove()+ " foi removido");
                    else
                        System.out.print("Vetor vazio");
                    break;
                case 3:
                    System.out.println(v1);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            opcao = menu();
        }
        System.out.println("Obrigado, volte sempre!!!");
        scanner.close();
    }
}


