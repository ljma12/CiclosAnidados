public class Numeros {
    public static void main(String[] args) {
        // Bucle exterior que controla el primer número (1 y 2)
        for (int i = 1; i <= 3; i++) {
            // Bucle interior que controla el segundo número (1, 2, 3)
            for (int j = 1; j <= 3; j++) {
                // Imprimir la combinación de i y j
                System.out.println(i + " "+ j);
            }
        }
    }
}
