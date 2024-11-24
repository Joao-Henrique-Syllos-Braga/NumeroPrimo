import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = scanner.nextInt(); //input nextInt define que o retorno vai ser um numero inteiro

        //Se o número for menor ou igual a 1, ele não é primo.
        //Dividir por todos os numeros de 2 até raiz de n.
        //Se algum desses numeros dividir n sem deixar resto, então n não é primo.
        //Caso contrário, é primo.

        boolean itsPrimo = true; // Inicializando como true, assumindo que é primo

        if (number <= 1) {
            itsPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            // Verificando divisibilidade até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    itsPrimo = false; // Se encontrar um divisor, não é primo
                    break; // Não precisa continuar verificando
                }
            }
        }

        if (itsPrimo) {
            System.out.println(number + " é primo");
        } else {
            System.out.println(number + " não é primo");
        }
    }
}
