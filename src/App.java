package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    
    public static String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Presenca> chamadas = new HashMap<>();
        List<String> nomeSalvo = new ArrayList<>();


        System.out.print("Digite o número de alunos a serem verificados: ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de nova linha

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("\nAluno #" + (i + 1) + "\n");

            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            nomeSalvo.add(nomeAluno);


            for (String dia : diasSemana) {
                System.out.print(dia + " - feira ");

                System.out.print("O aluno esteve presente? (S/N): ");
                String presencaInput = scanner.nextLine();
                boolean presente = presencaInput.equalsIgnoreCase("S");

                Aluno aluno = new Aluno(nomeAluno);
                Presenca presenca = chamadas.getOrDefault(dia, new Presenca(dia, new ArrayList<>()));
                presenca.addAlunos(aluno, presente);
                chamadas.put(dia, presenca);
            }
        }

        System.out.println("\nRegistro de presença concluído.");
        
        // Imprimir a tabela de presenças
        System.out.println("\nTabela de Presenças:");
        System.out.print("Aluno\t\t");
        for (String dia : diasSemana) {
            System.out.print(dia + "\t");
        }
        System.out.println();

        for (String nomeAluno : nomeSalvo) {
            System.out.print(nomeAluno + "\t\t");
            for (String dia : diasSemana) {
                Presenca presenca = chamadas.get(dia);
                List<Aluno> alunos = presenca.getAlunos();
                Aluno aluno = alunos.stream().filter(a -> a.getNome().equals(nomeAluno)).findFirst().orElse(null);
                boolean presente = presenca.verificarPresenca(aluno);
                String status = presente ? "P" : "F";
                System.out.print(status + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}