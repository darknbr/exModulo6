package src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
      
        System.out.println("--- Diario de Classes ---");

        int option;

        do {
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual operação deseja realizar: ");

            option = scanner.nextInt();

            process(option);

        } while (option != 0);
    }
    
    public static void process(int option) throws Exception {
        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o nome do aluno: ");
                String descricao = scanner.nextLine();
            
                break;
            }
        


        }
    }
}