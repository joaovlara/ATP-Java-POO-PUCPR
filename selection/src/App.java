public class App {

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;

        // Loop externo para percorrer todo o vetor
        for (int i = 0; i < n - 1; i++) {
            int menor = i; // Assume-se que o elemento atual é o menor

            // Loop interno para encontrar o menor elemento não ordenado
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j; // Atualiza o índice do menor elemento encontrado
                }
            }

            // Troca o elemento atual com o menor elemento encontrado
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }
    }

    public static void main(String[] args) {
        int[] vetor = { 3, 6, 8, 1, 4, 9, 0 };

        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        selectionSort(vetor); // Chama a função para ordenar o vetor

        System.out.println("\nVetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
