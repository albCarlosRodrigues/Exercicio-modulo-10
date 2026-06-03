import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        System.out.println("Digite o tamanho do vetor: ");
        Scanner sc = new Scanner(System.in);

        int tamanhoDoVetor = sc.nextInt();
        int[] vetorDoUsuario = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {
            System.out.println("Digite o valor da posição " + i + " do seu vetor: ");
            vetorDoUsuario[i] = sc.nextInt();
        }

        alterandoVetor(vetorDoUsuario);

        System.out.println("Novo vetor:");
        exibeVetor(vetorDoUsuario);

        sc.close();
    }

    private static void alterandoVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            if (vetorDoUsuario[i] % 2 == 0) {
                vetorDoUsuario[i] = vetorDoUsuario[i] * 2;
            } else {
                vetorDoUsuario[i] = (int) Math.pow(vetorDoUsuario[i], 2);
            }
        }
    }

    private static void exibeVetor(int[] vetorDoUsuario) {
        for (int i = 0; i < vetorDoUsuario.length; i++) {
            System.out.print(vetorDoUsuario[i] + " ");
        }
    }
}