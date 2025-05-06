public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        
        System.out.println("Digite 15 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para verificar quantas vezes aparece: ");
        int numero = scanner.nextInt();

        int contador = 0;
        for (int valor : vetor) {
            if (valor == numero) {
                contador++;
            }
        }

        System.out.println("O número " + numero + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}
