package projeto.projetoestagiobaiana;
import java.util.Scanner;


public class ProjetoEstagioBaiana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String produto;
        float preco;
        int quantidadeProduto;
        float valorTotal = 0;
        String continuar;
        
        do{
            System.out.println("Digite o produto:");
            produto = scanner.nextLine();
            
            System.out.println("Digite a quantidade: ");
            quantidadeProduto = scanner.nextInt();
            
            System.out.println("Digite o preco do produco");
            preco = scanner.nextFloat();
            
            valorTotal += quantidadeProduto * preco;
            scanner.nextLine();
            
            System.out.println("Quer adicionar algo a mais?");
            continuar = scanner.nextLine();
        
        }while (continuar.equalsIgnoreCase("s"));
        
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        
    }
}
