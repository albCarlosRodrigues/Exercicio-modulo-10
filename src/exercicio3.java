import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        char[] letras = nome.toCharArray();

        inverterNome(letras);

        System.out.println("Nome invertido:");
        exibeVetor(letras);

        sc.close();
    }

    private static void inverterNome(char[] letras) {
        for (int i = 0; i < letras.length / 2; i++) {
            char aux = letras[i];
            letras[i] = letras[letras.length - 1 - i];
            letras[letras.length - 1 - i] = aux;
        }
    }

    private static void exibeVetor(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
    }
}