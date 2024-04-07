public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 3, 6, 8, 1, 4, 9, 0 };
        bubbleSort(vetor);
        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean troca; // Indica se houve alguma troca durante a iteração

        // Executa iterações para percorrer o vetor
        for (int i = 0; i < n - 1; i++) {
            troca = false;

            // Compara elementos adjacentes e os troca se estiverem fora de ordem
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true; // Indica que houve uma troca
                }
            }

            // Se nenhuma troca ocorreu na iteração atual, o vetor está ordenado e podemos
            // parar
            if (!troca) {
                break;
            }
        }
    }
}
