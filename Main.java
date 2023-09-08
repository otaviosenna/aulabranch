import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entradas = new Scanner(System.in);
        
        int idUnica = 0; 
        
        String nome = ""; 
        
        String autor = ""; 
        
        System.out.println("Informe o tipo de item que quer cadastrar: "); 

        System.out.println("");
        
        String tipoDeItem = entradas.nextLine();
        
        System.out.println("Informe o código do item: "); 

        System.out.println("");
        
        int idUnica = entradas.nextInt();

        
        
        
        //Arquivo main pra gente trabalhar :) 

        0) Pergunta o tipo de item
        
        1) Direciona o cadastro 
        
        2) Faz o cadastro
        
        3) Imprime a lista 
        
        -------------------
        
        
        1) Cadastro comum (idUnica, nome, dataDeCompra, listaDeAutores, tipoDeItem)
        
        IF
        2) Livros (nomeEditora, anoPublicacao)
        
        3) CDS (genero, nomeDasMusicas)
        
        4) DVD (tipo, descricaoGeral) 
        
        5) Revistas (anoPublicacao, nomeEditora, volumePublicacao) 
        
        PRINT
        6) Imprimir lista por tipo de colecionável 
    }
}
