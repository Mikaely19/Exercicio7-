public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        // Preenchendo o vetor com números fornecidos pelo usuário
        System.out.println("Digite 15 números para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Pedindo ao usuário um número para contar
        System.out.print("Digite um número para contar quantas vezes ele aparece no vetor: ");
        int numero = scanner.nextInt();

        // Contando as ocorrências do número no vetor
        int contador = 0;
        for (int valor : vetor) {
            if (valor == numero) {
                contador++;
            }
        }

        // Exibindo o resultado
        System.out.println("O número " + numero + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}
