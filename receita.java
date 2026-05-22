package Senai_LLP_File_LivroDeReceitas;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class receita {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);

        System.out.print("Digite o nome da receita (ex: Bolo de Laranja): ");
        String nomeReceita = oi.nextLine();

        String nomeArquivo = nomeReceita.replace(" ", "_") + ".txt";

        try (PrintWriter gravarArq = new PrintWriter(new FileWriter(nomeArquivo))) {
            
            gravarArq.println(nomeReceita);
            gravarArq.println();

            System.out.println("\n--- INGREDIENTES ---");
            System.out.println("(Deixe a descrição em branco e aperte Enter para finalizar)");
            
            int contIngredientes = 1;
            while (true) {
                System.out.print("Descrição do ingrediente " + contIngredientes + ": ");
                String descricao = oi.nextLine();
                
                // Se o usuário não digitar nada, para o laço
                if (descricao.trim().isEmpty()) {
                    break;
                }
                
                System.out.print("Quantidade para " + descricao + ": ");
                String quantidade = oi.nextLine();
                
                // Grava o ingrediente formatado no arquivo
                gravarArq.println(contIngredientes + ". " + descricao + " - " + quantidade);
                contIngredientes++;
            }

            gravarArq.println();

            System.out.println("\n--- MODO DE PREPARO ---");
            System.out.println("(Deixe o passo em branco e aperte Enter para finalizar)");
            
            int contadorPassos = 1;
            while (true) {
                System.out.print("Passo " + contadorPassos + ": ");
                String passo = oi.nextLine();

                if (passo.trim().isEmpty()) {
                    break;
                }
    
                gravarArq.println("Passo " + contadorPassos + ": " + passo);
                contadorPassos++;
            }

            System.out.println("\nReceita salva com sucesso no arquivo: " + nomeArquivo);

        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}