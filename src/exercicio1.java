import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        System.out.println("Digite o tamanho do vetor: ");
        Scanner sc = new Scanner(System.in);

        int tamanhoDoVetor = sc.nextInt();
        int[] vetorDoUsuario = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {
            System.out.println("Digite o valor da posição " + i + " do seu vetor: ");
            vetorDoUsuario[i] = sc.nextInt();
        }

        ordenandoVetor(vetorDoUsuario);

        System.out.println("------------------------------------");

        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        nome = nome.toLowerCase();
        char[] letras = nome.toCharArray();

        contandoVogais(letras);

        sc.close();
    }

    private static void contandoVogais(char[] letras) {
        int quantidadeVogais = 0;

        for (int i = 0; i < letras.length; i++) {
            if (
                    letras[i] == 'a' ||
                            letras[i] == 'e' ||
                            letras[i] == 'i' ||
                            letras[i] == 'o' ||
                            letras[i] == 'u'
            ) {
                quantidadeVogais++;
            }
        }

        System.out.println("Quantidade de vogais encontradas: " + quantidadeVogais);
    }

    private static void exibeVetor(int[] vetorDoUsuario) {
        System.out.println("Vetor ordenado:");

        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }
    }

    private static void ordenandoVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length - 1; i++) {
            for (int j = 0; j < vetorDoUsuario.length - 1 - i; j++) {

                if (vetorDoUsuario[j] > vetorDoUsuario[j + 1]) {

                    int aux = vetorDoUsuario[j];
                    vetorDoUsuario[j] = vetorDoUsuario[j + 1];
                    vetorDoUsuario[j + 1] = aux;

                }
            }
        }

        exibeVetor(vetorDoUsuario);
    }
}